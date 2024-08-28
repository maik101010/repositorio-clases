package src.clase9.ejemplo3;

/**
 * Created by Michael Garcia on 27/08/24
 */
public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        // URL de la primera API pública
        String api1 = "https://api.restful-api.dev/objects";
        // URL de la segunda API pública
        String api2 = "https://jsonplaceholder.typicode.com/posts";

        // Crear hilos para cada API
//        ApiCallThread thread1 = new ApiCallThread(api1);
//        ApiCallThread thread2 = new ApiCallThread(api2);
        ItetationProcessThread thread1Iteration = new ItetationProcessThread();
        ItetationProcessThread thread2Iteration = new ItetationProcessThread();

        thread1Iteration.start();
//        thread1Iteration.join();
        System.out.println("Termino el " + thread1Iteration.getName());
        thread2Iteration.start();
//        System.out.println("Termino el " + thread2Iteration.getName());
//        thread3Iteration.join();

//
        int sum = thread1Iteration.getSum();
        System.out.println("The sum is: " + sum);
//        System.out.println(thread1.getName() + " Finished with response " + thread1.getApiResponse());
//        System.out.println(thread2.getName() + " Finished with response " + thread2.getApiResponse());
//        System.out.println("Both API calls completed.");
    }

}
