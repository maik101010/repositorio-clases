package src.clase2.ejemplo3;

/**
 * Created by Michael Garcia on 13/08/24
 */
public class Refrigerador extends Electrodomestico {

    public Refrigerador(String nombre, String marca, double precio) {
        super(nombre, marca, precio);
    }

    // Métodos abstractos implementados
    @Override
    public void prender() {
        System.out.println("prendiendo Refrigerador");
    }

    @Override
    public void apagar() {
        System.out.println("apagando Refrigerador");
    }

    @Override
    public void operar()
    {
        System.out.println("Enfriar");
    }
}
