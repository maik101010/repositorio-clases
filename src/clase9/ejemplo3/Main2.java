package src.clase9.ejemplo3;

/**
 * Created by Michael Garcia on 27/08/24
 */
public class Main2
{
    public static void main(String[] args) throws InterruptedException
    {
        ItetationProcessThread thread1Iteration = new ItetationProcessThread();
        ItetationProcessThread thread2Iteration = new ItetationProcessThread();
        ItetationProcessThread thread3Iteration = new ItetationProcessThread();
        ItetationProcessThread thread4Iteration = new ItetationProcessThread();

        thread1Iteration.start();
        thread2Iteration.start();
        thread3Iteration.start();
        thread4Iteration.start();

        thread1Iteration.join();
        thread2Iteration.join();
        thread3Iteration.join();
        thread4Iteration.join();

        int sum = thread1Iteration.getSum();
        System.out.println("The sum is: " + sum);
    }

}
