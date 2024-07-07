package Tasca1.Nivel3.Command;

import Tasca1.Nivel3.Vehicle.Avion;
import Tasca1.Nivel3.Vehicle.Cotxe;
import Tasca1.Nivel3.Vehicle.Barco;
import Tasca1.Nivel3.Vehicle.Bici;

public class Frenar implements Command {
    private Object vehicle;

    public Frenar(Object vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        System.out.println("Frenar");
    }
}
