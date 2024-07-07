package Tasca1.Nivel3.Command;

import Tasca1.Nivel3.Vehicle.Avion;
import Tasca1.Nivel3.Vehicle.Barco;
import Tasca1.Nivel3.Vehicle.Bici;
import Tasca1.Nivel3.Vehicle.Cotxe;

public class Arrancar implements Command {
    private Object vehicle;
    public Arrancar(Object vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        System.out.println("Arrancando");
    }
}
