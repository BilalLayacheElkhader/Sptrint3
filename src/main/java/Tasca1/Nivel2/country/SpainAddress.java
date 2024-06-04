package Tasca1.Nivel2.country;

import Tasca1.Nivel2.country.CountryAddress;

public class SpainAddress implements CountryAddress {
    private static final String country = "ESP";


    @Override
    public String CreateAddress() {
       return country;
    }
}
