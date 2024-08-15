package src.clase4.ejercicios;

import src.clase4.Persona;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class Ordenamiento
{

    public static void main(String[] args)
    {
        //1- Intentar implementar el compareTo de manera funcional, con expresiones lambda
//        Comparator<Persona> comparatorEdad1 = (Persona o1, Persona o2) -> ((Integer) o1.getEdad()).compareTo(o2.getEdad());
//        Comparator<Persona> comparatorEdad2 = (Persona o1, Persona o2) -> Integer.compare(o1.getEdad(), o2.getEdad());
        Comparator<Persona> comparatorEdad3 = Comparator.comparingInt(Persona::getEdad);


        Set<Persona> tree2 = new TreeSet<>(comparatorEdad3);
        tree2.add(new Persona("Edgar", 28, "SON", 'M'));
        tree2.add(new Persona("Ana", 23, "CDMX", 'F'));
        tree2.add(new Persona("Carolina", 21, "EDOMEX", 'F'));
        tree2.add(new Persona("Zaira", 20, "PUE", 'F'));
        tree2.add(new Persona("Zaira", 20, "PUE", 'F'));

        System.out.println("-*-*-*SALIDA DE TREESET (ordenado por edad)-*-*-*");
        for (Persona persona : tree2)
        {
            System.out.println(persona);
        }
    }
}