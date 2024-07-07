package Tasca2.Nivel1;

public class Main {
    public static void main(String[] args) {
       Broker broker = new Broker();

       Observer agencyA = new Agency("AgencyA");
       Observer agencyB = new Agency("AgencyB");

       broker.addObserver(agencyA);
       broker.addObserver(agencyB);

       broker.setStock("Stock down");
       broker.setStock("Stock up");



    }
}
