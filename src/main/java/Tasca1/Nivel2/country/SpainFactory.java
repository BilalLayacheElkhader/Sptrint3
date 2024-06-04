package Tasca1.Nivel2.country;

import Tasca1.Nivel2.phone.SpainNumber;
import Tasca1.Nivel2.factory.GUIFactory;
import Tasca1.Nivel2.phone.PhoneNumber;

public class SpainFactory implements GUIFactory {
    @Override
    public PhoneNumber createPhonenumber() {
        return new SpainNumber();
    }

    @Override
    public CountryAddress createAddress() {
        return new SpainAddress();
    }
}
