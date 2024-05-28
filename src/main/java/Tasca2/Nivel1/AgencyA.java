package Tasca2.Nivel1;

public class AgencyA implements Observer{
    private String name;

    public AgencyA(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+" the stock market is "+message);
    }
}
