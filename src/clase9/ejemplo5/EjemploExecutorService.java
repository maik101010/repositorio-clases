package src.clase9.ejemplo5;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Michael Garcia on 28/08/24
 */
public class EjemploExecutorService
{
    public static void main(String[] args)
    {

//        Runnable task1 = () -> System.out.println("Ejecutando tarea 1 " + Thread.currentThread().getName());
        Runnable task2 = () -> {
            System.out.println("Ejecutando tarea 2 " + Thread.currentThread().getName());
            for (int i = 0; i < 100; i++)
            {
                try
                {
                    System.out.println("Dentro de la tarea 2 " + Thread.currentThread().getName());
                    Thread.sleep(500);
                } catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable task8 = () -> {
            System.out.println("Ejecutando tarea 8 " + Thread.currentThread().getName());
            for (int i = 0; i < 100; i++)
            {
                try
                {
                    System.out.println("Dentro de la tarea 8 " + Thread.currentThread().getName());
                    Thread.sleep(500);
                } catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable task7 = () -> {
            System.out.println("Ejecutando tarea 7 " + Thread.currentThread().getName());
            for (int i = 0; i < 100; i++)
            {
                try
                {
                    System.out.println("Dentro de la tarea 7 " + Thread.currentThread().getName());
                    Thread.sleep(500);
                } catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        };
        Runnable task6 = () -> {
            System.out.println("Ejecutando tarea 6 " + Thread.currentThread().getName());
            for (int i = 0; i < 100; i++)
            {
                try
                {
                    System.out.println("Dentro de la tarea 6 " + Thread.currentThread().getName());
                    Thread.sleep(500);
                } catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
        };
//        Runnable task3 = () -> System.out.println("Ejecutando tarea 3 " + Thread.currentThread().getName());
//        Runnable task4 = () -> System.out.println("Ejecutando tarea 4 " + Thread.currentThread().getName());
//        Runnable task5 = () -> System.out.println("Ejecutando tarea 5 " + Thread.currentThread().getName());
//        Runnable task9 = () -> System.out.println("Ejecutando tarea 9 " + Thread.currentThread().getName());


        ExecutorService poolThreads = Executors.newFixedThreadPool(4);

        poolThreads.submit(task2);
        poolThreads.submit(task2);
        poolThreads.submit(task2);
        poolThreads.submit(task2);
        poolThreads.submit(task8);
        poolThreads.submit(task6);
        poolThreads.submit(task7);
        poolThreads.submit(task8);
        poolThreads.submit(task7);

        poolThreads.shutdown();

    }
}
