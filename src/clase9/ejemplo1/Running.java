package src.clase9.ejemplo1;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by Michael Garcia on 26/08/24
 */
public class Running extends Cajero
{

    public Running(String name, Client client)
    {
        super(name, client);
    }

    @Override
    public void run()
    {
        processSell();
    }

    public void processSell()
    {
        LocalTime hora = LocalTime.now();
        System.out.println("La cajera " + this.nameWorker + " comienza a procesar a cliente " + this.client.getNombre() + "" +
                " A la hora " + hora);
        for (String product : this.client.getProductos())
        {
            waitProcess();
            System.out.println("Se ha procesado el producto " + product + " por parte de " + this.nameWorker + " para el cliente " + this.client.getNombre());
        }

        System.out.println("La cajera " + this.nameWorker + " ha finalizado de procesar el carrito del cliente " + this.client.getNombre() +
                " en " + hora.until(LocalTime.now(), ChronoUnit.SECONDS) + " segundos");

    }

    private void waitProcess()
    {
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
