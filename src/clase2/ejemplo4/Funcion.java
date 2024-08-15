package src.clase2.ejemplo4;

/**
 * Created by Michael Garcia on 13/08/24
 */
public interface Funcion
{
    default String myDefaultMethod()
    {
        return "hello from default function";
    }

    default void prender()
    {
        System.out.println("prender");
    }

    default void apagar()
    {
        System.out.println("apagar");
    }

    static String methodStatic()
    {
        return "String cualquiera";
    }

    void operar();

//    class PerroJuguete implements Funcion
//    {
//        public void operar()
//        {
//            System.out.println("correr y morder");
//        }
//    }

    static void main(String[] args)
    {
        //perro juguete
        Funcion perroJuguete = () -> System.out.println("Perro corriendo y mordiendo");
        perroJuguete.operar();

        //refrigerador
        Funcion refrigerador = () -> System.out.println("Refrigerador enfriando");
        refrigerador.operar();

        //televisor
        Funcion televisor = () -> System.out.println("Mostrando shows");
        televisor.operar();

        Funcion instanciaObject = new PerroJuguete();
        instanciaObject.apagar();
        instanciaObject.prender();
        instanciaObject.operar();
        String answer = instanciaObject.myDefaultMethod();
        System.out.println(answer);
    }

}
