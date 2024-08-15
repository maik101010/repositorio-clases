package src.clase4;

/**
 * Created by Michael Garcia on 15/08/24
 */
public class Anonima
{
    interface Funcionalidad<T, U, R>
    {
        R operacion(T valor1, U valor2);
    }

    public static void main(String[] args)
    {
        Funcionalidad<String, String, String> funcionalidad1 = (n1, n2) -> n1.concat(n2);
        System.out.println(funcionalidad1.operacion("3", "4"));

        Funcionalidad<Integer, Integer, Integer> funSumar = (n1, n2) -> n1+n2;
        System.out.println(funSumar.operacion(2,3));

        Funcionalidad<String, String, Boolean> funTest = (n1, n2) -> n1.equals(n2);
        System.out.println(funTest.operacion("test", "Test"));

    }
}
