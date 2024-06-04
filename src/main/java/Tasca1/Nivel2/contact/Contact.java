package Tasca1.Nivel2.contact;

public class Contact {
    private String phoneNumber;
    private String number;
    private String countryAddress;
    private String address;

    public Contact(String phoneNumber,String number,String countryAddress, String address) {
        this.phoneNumber = phoneNumber;
        this.number = number;
        this.countryAddress = countryAddress;
        this.address = address;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCountryAddress() {
        return countryAddress;
    }

    public void setCountryAddress(String countryAddress) {
        this.countryAddress = countryAddress;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", number='" + number + '\'' +
                ", countryAddress='" + countryAddress + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
