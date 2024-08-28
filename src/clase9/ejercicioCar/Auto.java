package src.clase9.ejercicioCar;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by Michael Garcia on 27/08/24
 */
class Auto implements Runnable
{
    static int DISTANCIA_RECORRER = 20;
    public static boolean isGanador = false;
    private static final AtomicBoolean flag = new AtomicBoolean(false);

    private final String name;
    private final int velocidad;

    public Auto(String name, int velocidad)
    {
        this.name = name;
        this.velocidad = velocidad;
    }

    @Override
    public void run()
    {
        int distanciaRecorrida = 0;
        LocalTime startTime = LocalTime.now();
        while (distanciaRecorrida < DISTANCIA_RECORRER && !flag.get())
        {
            try
            {
                Thread.sleep(1000);
                distanciaRecorrida = distanciaRecorrida + velocidad;
                System.out.println(distanciaRecorrida);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
        if (distanciaRecorrida >= DISTANCIA_RECORRER && flag.compareAndSet(false, true))
        {
            System.out.println(name + " Gano!!! y terminó en " + startTime.until(LocalTime.now(), ChronoUnit.SECONDS) + " segundos.");
        }
        else if (flag.get())
        {
            System.out.println(name + " se detuvo porque otro carro ya gano.");
        }

    }
}


