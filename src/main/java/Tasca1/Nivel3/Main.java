package Tasca1.Nivel3;

public class Main {
    public static void main(String[] args) {
        Cotxe cotxe = new Cotxe();
        Bici bici = new Bici();
        Avion avion = new Avion();
        Barco barco = new Barco();

        Controller controller = new Controller();
        controller.setCommand(new Arrancar(cotxe));
        controller.executeCommand();
        controller.setCommand(new Arrancar(avion));
        controller.executeCommand();
        controller.setCommand(new Frenar(cotxe));
        controller.executeCommand();
        controller.setCommand(new Acelerar(avion));
        controller.executeCommand();
        controller.setCommand(new Frenar(avion));
        controller.executeCommand();
    }
}
