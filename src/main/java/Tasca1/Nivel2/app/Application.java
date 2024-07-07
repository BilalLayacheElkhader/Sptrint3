package Tasca1.Nivel2.app;

import Tasca1.Nivel2.contact.Contact;
import Tasca1.Nivel2.country.CountryAddress;
import Tasca1.Nivel2.factory.GUIFactory;
import Tasca1.Nivel2.phone.PhoneNumber;

import java.util.*;

public class Application {
    private static final Scanner sc = new Scanner(System.in);
    private PhoneNumber phoneNumber;
    private CountryAddress countryAddress;
    private static final ArrayList<Contact> contacts = new ArrayList<>();
    public Application(GUIFactory guiFactory){
        phoneNumber = guiFactory.createPhonenumber();
        countryAddress = guiFactory.createAddress();

    }
    public void addClient(){
        try {
            System.out.println("INTRODUCE TU NUMERO DE TELEFONO");
            String phone = sc.nextLine();
            System.out.println("INTROUDUCE TU CALLE");
            String address = sc.nextLine();

            String prefix = phoneNumber.phoneNumber();
            String country = countryAddress.CreateAddress();
            Contact contact = new Contact(prefix, phone, country, address);
            contacts.add(contact);
            for (Contact c : contacts) {
                System.out.println(c);
            }
        }catch (Exception e){
            System.out.println("ERROR INESPERADO:");
            sc.nextLine();
        }
    }

}
