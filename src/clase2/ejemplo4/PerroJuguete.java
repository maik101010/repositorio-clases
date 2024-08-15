package src.clase2.ejemplo4;

/**
 * Created by Michael Garcia on 13/08/24
 */
public class PerroJuguete implements Funcion

{
    @Override
    public void prender()
    {
        System.out.println("prender");
    }

    @Override
    public void apagar()
    {
        System.out.println("apagar");

    }

    @Override
    public void operar()
    {
        System.out.println("correr y morder");
    }
}
