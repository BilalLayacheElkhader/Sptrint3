package Tasca1.Nivel2.factory;

import Tasca1.Nivel2.phone.IrelandNumber;
import Tasca1.Nivel2.phone.PhoneNumber;
import Tasca1.Nivel2.country.CountryAddress;
import Tasca1.Nivel2.country.IrelandAddress;

public class IrelandFactory implements GUIFactory {
    @Override
    public PhoneNumber createPhonenumber() {
        return new IrelandNumber();
    }

    @Override
    public CountryAddress createAddress() {
        return new IrelandAddress();
    }
}
