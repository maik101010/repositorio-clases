package src.clase2.ejemplo4;

/**
 * Created by Michael Garcia on 13/08/24
 */
public class Refrigerador implements Funcion
{
    private int myVariable;
    @Override
    public void prender()
    {
        System.out.println("Prendiendo");
    }

    @Override
    public void apagar()
    {
        System.out.println("Apagando");
    }

    @Override
    public void operar()
    {
        System.out.println("Enfriando");
    }
}
