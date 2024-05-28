package Tasca1.Nivel2;

public class IrelandNumber implements PhoneNumber{
    private static final String numberPrefix = "00353";

    @Override
    public String phoneNumber() {
        return numberPrefix;
    }
}
