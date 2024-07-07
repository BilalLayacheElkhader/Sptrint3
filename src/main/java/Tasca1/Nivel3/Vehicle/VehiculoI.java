package Tasca1.Nivel3.Vehicle;

import Tasca1.Nivel3.Command.Acelerar;
import Tasca1.Nivel3.Command.Arrancar;
import Tasca1.Nivel3.Command.Frenar;

public interface VehiculoI {
   void acelerar();
   void frenar();
   void arrancar();
}
