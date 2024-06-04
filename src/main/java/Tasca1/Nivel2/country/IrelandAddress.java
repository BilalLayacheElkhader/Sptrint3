package Tasca1.Nivel2.country;

import Tasca1.Nivel2.country.CountryAddress;

public class IrelandAddress implements CountryAddress {
    private static final String country = "IRL";

    @Override
    public String CreateAddress() {
        return country;
    }
}
