package Tasca1.Nivel3;

public class Frenar implements Command{
    private Object vehicle;

    public Frenar(Object vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
            if(vehicle instanceof Cotxe){
                ((Cotxe)vehicle).frenar();
            } else if (vehicle instanceof Bici) {
                ((Bici)vehicle).frenar();
            } else if (vehicle instanceof Barco) {
                ((Barco)vehicle).frenar();
            } else if (vehicle instanceof  Avion) {
                ((Avion)vehicle).frenar();
            }
    }
}
