package src.clase9.ejemplo1;

import java.time.LocalTime;
import java.util.Arrays;

/**
 * Created by Michael Garcia on 26/08/24
 */
public class Main
{
    public static void main(String[] args)
    {
        LocalTime time = LocalTime.now();
        System.out.println("Inicia hilos " + time);
        Client client1 = new Client();
        client1.setNombre("Michael");
        client1.setProductos(Arrays.asList("Manzana", "Carne", "Huevos"));
        Client client2 = new Client();
        client2.setNombre("Oscar");
        client2.setProductos(Arrays.asList("Naranja", "Carne", "Pollo", "Salchichas", "Huevos"));

        Running running1 = new Running("Viviana", client1);
        Running running2 = new Running("Laura", client2);

        running2.start();
        running1.start();

//        System.out.println("Finaliza hilos " + time.until(LocalTime.now(), ChronoUnit.SECONDS));


    }
}
