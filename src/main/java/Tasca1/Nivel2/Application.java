package Tasca1.Nivel2;

import java.util.*;

public class Application {
    static Scanner sc = new Scanner(System.in);
    private PhoneNumber phoneNumber;
    private CountryAddress countryAddress;
    static ArrayList<Contact> contacts = new ArrayList<>();
    public Application(GUIFactory guiFactory){
        phoneNumber = guiFactory.createPhonenumber();
        countryAddress = guiFactory.createAddress();

    }
    public void addClient(){

            System.out.println("INTRODUCE TU NUMERO DE TELEFONO");
            String phone = sc.nextLine();
            System.out.println("INTROUDUCE TU CALLE");
            String address = sc.nextLine();
            String prefix = phoneNumber.phoneNumber();
            String country = countryAddress.CreateAddress();
            Contact contact = new Contact(prefix,phone,country,address);
            contacts.add(contact);
            for (Contact c : contacts){
                System.out.println(c);
            }

    }

}
