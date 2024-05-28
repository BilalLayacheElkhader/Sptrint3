package Tasca1.Nivel2;

public class IrelandFactory implements GUIFactory{
    @Override
    public PhoneNumber createPhonenumber() {
        return new IrelandNumber();
    }

    @Override
    public CountryAddress createAddress() {
        return new IrelandAddress();
    }
}
