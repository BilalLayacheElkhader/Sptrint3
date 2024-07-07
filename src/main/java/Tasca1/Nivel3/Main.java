package Tasca1.Nivel3;

import Tasca1.Nivel3.Command.Acelerar;
import Tasca1.Nivel3.Command.Arrancar;
import Tasca1.Nivel3.Command.Controller;
import Tasca1.Nivel3.Command.Frenar;
import Tasca1.Nivel3.Vehicle.Avion;
import Tasca1.Nivel3.Vehicle.Barco;
import Tasca1.Nivel3.Vehicle.Bici;
import Tasca1.Nivel3.Vehicle.Cotxe;

public class Main {
    public static void main(String[] args) {

        // no esta correctamente acabado, no entregar

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
