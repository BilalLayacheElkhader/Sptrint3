package Tasca1.Nivel2;

public class SpainNumber implements PhoneNumber{
    private static final String numberPrefix = "0034";


    @Override
    public String phoneNumber() {
        return numberPrefix;
    }
}
