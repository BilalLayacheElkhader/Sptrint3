package Tasca1.Nivel2;

public class SpainFactory implements GUIFactory{
    @Override
    public PhoneNumber createPhonenumber() {
        return new SpainNumber();
    }

    @Override
    public CountryAddress createAddress() {
        return new SpainAddress();
    }
}
