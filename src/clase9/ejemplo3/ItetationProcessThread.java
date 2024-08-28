package src.clase9.ejemplo3;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Michael Garcia on 27/08/24
 */

public class ItetationProcessThread extends Thread
{
    static int sumNormal;
//    static AtomicInteger sum = new AtomicInteger();
//    private static final Object lock = new Object();
    @Override
    public void run()
    {
//        synchronized (lock)
//        {
            for (int i = 0; i < 10; i++)
            {
                try
                {
                    Thread.sleep(500);
                    System.out.println("Current " + (sumNormal += i) + " " + this.getName());
//                    System.out.println("Current " + sum.addAndGet(i) + " " + this.getName());
                } catch (InterruptedException e)
                {
                    throw new RuntimeException(e);
                }
            }
//        }
    }

    public int getSum()
    {
        return sumNormal;
    }
//    public int getSum()
//    {
//        return sum.get();
//    }
}
