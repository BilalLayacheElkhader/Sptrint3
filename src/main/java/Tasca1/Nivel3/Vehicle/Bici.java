package Tasca1.Nivel3.Vehicle;

import Tasca1.Nivel3.Command.Acelerar;
import Tasca1.Nivel3.Command.Arrancar;
import Tasca1.Nivel3.Command.Frenar;

public class Bici implements VehiculoI{
    @Override
    public void arrancar(){
        System.out.println("Bici arrancando");
    }
    @Override
    public void acelerar(){
        System.out.println("Bici acelerando");
    }
    @Override
    public void frenar(){
        System.out.println("Bici frenando");
    }
}
