package Tasca1.Nivel3.Vehicle;

public class Barco implements VehiculoI{

    @Override
    public void acelerar() {
        System.out.println("Acelerando barco");
    }

    @Override
    public void frenar() {
        System.out.println("Barco frenando");
    }

    @Override
    public void arrancar() {
        System.out.println("Barco arrancando");
    }
}
