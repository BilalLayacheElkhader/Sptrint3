package Tasca1.Nivel2.factory;

import Tasca1.Nivel2.phone.PhoneNumber;
import Tasca1.Nivel2.country.CountryAddress;

public interface GUIFactory {
    PhoneNumber createPhonenumber();
    CountryAddress createAddress();
}
