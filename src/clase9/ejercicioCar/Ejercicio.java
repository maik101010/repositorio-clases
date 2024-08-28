package src.clase9.ejercicioCar;

/**
 * Created by Michael Garcia on 27/08/24
 */

public class Ejercicio
{
    public static void main(String[] args) throws InterruptedException
    {
        Runnable carro1 = new Auto("Carro1", (int) (10 * Math.random()));
        Runnable carro2 = new Auto("Carro2", (int) (10 * Math.random()));

        Thread threadCarro1 = new Thread(carro1);
        Thread threadCarro2 = new Thread(carro2);
        threadCarro1.start();
        threadCarro2.start();

    }

}
