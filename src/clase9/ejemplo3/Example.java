package src.clase9.ejemplo3;

/**
 * Created by Michael Garcia on 27/08/24
 */
public class Example
{
    public static void main(String[] args)
    {
        int sumNormal=0;
        for (int i = 0; i < 10; i++)
        {
                System.out.println("Current " + (sumNormal += i));
        }
        System.out.println(sumNormal*4);
    }
}
