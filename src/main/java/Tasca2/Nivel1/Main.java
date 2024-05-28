package Tasca2.Nivel1;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Observer agencyA = new AgencyA("Agencia A");
        Observer agencyB = new AgencyB("Agencia B");

        stock.addObserver(agencyA);
        stock.addObserver(agencyB);

        stock.setStock("UP!");
        stock.setStock("DOWN!");
        stock.setStock("UP!");
    }
}
