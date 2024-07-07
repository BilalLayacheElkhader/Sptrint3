package Tasca1.Nivel3.Vehicle;

import Tasca1.Nivel3.Command.Acelerar;
import Tasca1.Nivel3.Command.Arrancar;
import Tasca1.Nivel3.Command.Frenar;

public class Cotxe implements VehiculoI{
    @Override
    public void arrancar(){
        System.out.println("Cotxe arrancando");
    }
    @Override
    public void acelerar(){
        System.out.println("Cotxe acelerando");
    }
    @Override
    public void frenar(){
        System.out.println("Cotxe frenando");
    }
}
