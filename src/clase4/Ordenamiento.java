package src.clase4;

import src.clase2.ejemplo4.Funcion;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class Ordenamiento implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getDireccion().compareTo(o2.getDireccion());
    }

    public static void main(String[] args) {
        Ordenamiento porEdad = new Ordenamiento();

        /* Enviamos al constructor de TreeSet el ordenamiento */
        Set<Persona> tree2 = new TreeSet<>(porEdad);
        tree2.add(new Persona("Edgar", 28, "SON", 'M'));
        tree2.add(new Persona("Ana", 23, "CDMX", 'F'));
        tree2.add(new Persona("Carolina", 21, "EDOMEX", 'F'));
        tree2.add(new Persona("Zaira", 20, "PUE", 'F'));
        tree2.add(new Persona("Zaira", 20, "PUE", 'F'));

        System.out.println("-*-*-*SALIDA DE TREESET (ordenado por edad)-*-*-*");
        for (Persona persona : tree2) {
            System.out.println(persona);
        }
    }
}