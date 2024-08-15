package src.clase2.ejemplo3;

public abstract class Electrodomestico {
    private String nombre;
    private String marca;
    private double precio;

    public Electrodomestico(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public abstract void prender();
    public abstract void apagar();
    public abstract void operar();
}