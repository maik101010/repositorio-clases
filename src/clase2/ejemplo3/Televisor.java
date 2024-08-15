package src.clase2.ejemplo3;

/**
 * Created by Michael Garcia on 13/08/24
 */
public class Televisor extends Electrodomestico {

    public Televisor(String nombre, String marca, double precio) {
        super(nombre, marca, precio);
    }

    // Métodos abstractos implementados
    @Override
    public void prender() {
        System.out.println("prendiendo televisor");
    }

    @Override
    public void apagar() {
        System.out.println("apagando apagar");
    }

    @Override
    public void operar()
    {
        System.out.println("Mostrar shows");
    }

}
