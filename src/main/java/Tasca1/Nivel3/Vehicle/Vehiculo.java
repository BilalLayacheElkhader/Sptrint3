package Tasca1.Nivel3.Vehicle;

public class Vehiculo {
    private String name;

    public Vehiculo(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "name='" + name + '\'' +
                '}';
    }
}
