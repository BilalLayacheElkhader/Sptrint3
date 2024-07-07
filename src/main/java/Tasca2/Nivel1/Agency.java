package Tasca2.Nivel1;

public class Agency implements Observer {
    private String name;

    public Agency(String name) {

        this.name = name;
    }

    @Override
    public void update(String message) {

        System.out.println(name+" the stock market is "+message);
    }
}
