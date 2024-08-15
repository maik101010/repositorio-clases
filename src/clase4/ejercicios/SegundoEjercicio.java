package src.clase4.ejercicios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Michael Garcia on 15/08/24
 */
public class SegundoEjercicio

{
    public static void main(String[] args)
    {
//
//        2- Objetivo: Utilizar Set para realizar operaciones de unión e intersección de dos conjuntos.
//        Crea dos Set<Integer> con algunos elementos.
//        Crea un método que calcule la unión de ambos conjuntos y devuelva un Set<Integer>.
//        Crea otro método que calcule la intersección de ambos conjuntos y devuelva un Set<Integer>.
//
//        input:
//        1, 2, 3, 4
//        3, 4, 5, 6
//
//        output:
//        1,2,3,4,5,6

        Set<Integer> conjunto1 = new HashSet<>();
        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);
        conjunto1.add(4);

        Set<Integer> conjunto2 = new HashSet<>();
        conjunto2.add(3);
        conjunto2.add(4);
        conjunto2.add(5);
        conjunto2.add(6);

        Set<Integer> res = new HashSet<>(conjunto1);
        res.addAll(conjunto2);

        System.out.println(res);


    }
}
