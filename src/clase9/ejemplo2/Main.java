package src.clase9.ejemplo2;

/**
 * Created by Michael Garcia on 26/08/24
 */
public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Runnable tare1 = () -> {
            System.out.println("Comenzando: " + Thread.currentThread().getName());
            int tmp = 0;
            for (int i = 0; i < 100; i++)
            {
                System.out.println("La suma va en " + (tmp += i) + " " +Thread.currentThread().getName());
            }

            try
            {
                Thread.sleep(1000);
                System.out.println("La suma es: " + tmp + " en " + Thread.currentThread().getName());
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        };

        Runnable tare2 = () -> {
            System.out.println("Comenzando: " + Thread.currentThread().getName());
            int tmp = 0;
            for (int i = 0; i < 1000; i++)
                System.out.println("La suma va en " + (tmp += i) + " " + Thread.currentThread().getName());
            try
            {
                Thread.sleep(5000);
                System.out.println("La suma es: " + tmp + " en " + Thread.currentThread().getName());
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        };

        Thread thread1 = new Thread(tare1);
        thread1.start();

        Thread thread2 = new Thread(tare2);
        thread2.start();

    }
}
