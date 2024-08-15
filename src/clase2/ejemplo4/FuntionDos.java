package src.clase2.ejemplo4;

/**
 * Created by Michael Garcia on 13/08/24
 */
interface Mayuscula
{
    boolean esMayuscula(String valor);

    static void main(String[] args)
    {
        Mayuscula m = (String palabra) -> palabra.toUpperCase() == palabra;
        System.out.println(m.esMayuscula("Hola"));
        System.out.println(m.esMayuscula("HOLA"));

    }
}

interface Operacion
{
    double convertir(String cadena);
}

public interface FuntionDos
{
    int operar(int numero1, int numero2);

    static void main(String[] args)
    {

        Operacion op = (String s) -> Double.valueOf(s);
        double ans = op.convertir("12312.0");
        double ansPapitas = op.convertir("papitas");
        System.out.println(ansPapitas);


//        FuntionDos ejemplo1 = (int n1, int n2) -> 1;
//        FuntionDos ejemplo2 = (int n1, int n2) -> n1 + n2;
//        FuntionDos ejemplo3 = (int n1, int n2) -> n1 * n2;
//        FuntionDos ejemplo4 = (int n1, int n2) -> n1 / n2;
//        FuntionDos ejemplo5 = (int n1, int n2) -> n1 & n2;
//        FuntionDos ejemplo6 = (int n1, int n2) -> n1 | n2;
//        System.out.println(ejemplo1.operar(1, 2));
//        System.out.println(ejemplo2.operar(1, 2));
//        System.out.println(ejemplo3.operar(1, 2));
//        System.out.println(ejemplo4.operar(1, 2));
//        System.out.println(ejemplo5.operar(1, 2));
//        System.out.println(ejemplo6.operar(1, 2));
//        1
//        3
//        2
//        0
//        0
//     00001
//     00010  &
//        11

    }
}

