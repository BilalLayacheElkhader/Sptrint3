package Tasca1.Nivel3;

public class Acelerar implements Command{
    private Object vehicle;

    public Acelerar(Object vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
            if(vehicle instanceof Cotxe){
                ((Cotxe)vehicle).accelerar();
            } else if (vehicle instanceof Bici) {
                ((Bici)vehicle).accelerar();
            } else if (vehicle instanceof Barco) {
                ((Barco)vehicle).accelerar();
            } else if (vehicle instanceof  Avion) {
                ((Avion)vehicle).accelerar();
            }
        }
    }

