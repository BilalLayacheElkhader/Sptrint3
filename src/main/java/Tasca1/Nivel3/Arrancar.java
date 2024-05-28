package Tasca1.Nivel3;

public class Arrancar implements Command {
    private Object vehicle;
    public Arrancar(Object vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        if(vehicle instanceof Cotxe){
            ((Cotxe)vehicle).arrancar();
        } else if (vehicle instanceof Bici) {
            ((Bici)vehicle).arrancar();
        } else if (vehicle instanceof Barco) {
            ((Barco)vehicle).arrancar();
        } else if (vehicle instanceof  Avion) {
            ((Avion)vehicle).arrancar();
        }
    }
}
