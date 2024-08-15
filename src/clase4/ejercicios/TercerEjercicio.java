package src.clase4.ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Michael Garcia on 15/08/24
 */
public class TercerEjercicio
{
    static class Estudiante
    {
        int nota;
        String nombre;

        public Estudiante(int nota, String nombre)
        {
            this.nota = nota;
            this.nombre = nombre;
        }

        public int getNota()
        {
            return nota;
        }

        public String getNombre()
        {
            return nombre;
        }

        @Override
        public String toString()
        {
            return "Estudiante{" +
                    "nota=" + nota +
                    ", nombre='" + nombre + '\'' +
                    '}';
        }
    }

    protected static Map<Integer, List<String>> solution(List<Estudiante> list)
    {
        Map<Integer, List<String>> mapa = new HashMap<>();
        List<String> lisStudents = null;
        for (Estudiante estudiante : list)
        {
            int keyNota = estudiante.getNota();
            if (mapa.containsKey(keyNota))
            {
                List<String> actualListaEstudiantes = mapa.get(keyNota);
                actualListaEstudiantes.add(estudiante.getNombre());
                mapa.put(keyNota, actualListaEstudiantes);
            }
            else
            {
                lisStudents = new ArrayList<>();
                lisStudents.add(estudiante.getNombre());
                mapa.put(keyNota, lisStudents);
            }
        }
        return mapa;
    }

    public static void main(String[] args)
    {
//        3- Objetivo: Utilizar un Map para agrupar estudiantes según su calificación.
//            Crea una clase Estudiante con atributos String nombre y int nota.
//              Crea un método que reciba una lista de estudiantes (List<Estudiante>) y devuelva un Map<Integer, List<String>>,
//            donde la clave es la nota y el valor es una lista de nombres de los estudiantes que obtuvieron esa nota.
//              recorre la lista de estudiantes y agrúpalos en el mapa según su calificación.
//            Mostrar en pantalla quieres aprueban con mas de 5 o desaprueban
        List<Estudiante> estudiantes = List.of(new Estudiante(1, "Martha"),
                new Estudiante(1, "Miguel"),
                new Estudiante(6, "Oscar"),
                new Estudiante(7, "Michael"),
                new Estudiante(2, "Juanita"),
                new Estudiante(3, "Juan"));
        Map<Integer, List<String>> response = solution(estudiantes);
        System.out.println(response);

        List<String> desaprueban = new ArrayList<>();
        List<String> aprueban = new ArrayList<>();

        for (Integer key : response.keySet())
        {
            if (key <= 5)
            {
//                System.out.println("Ustedes desaprueban: " + response.get(key));
                desaprueban.addAll(response.get(key));
            }
            else
            {
//                System.out.println("Ustedes aprueban: " + response.get(key));
                aprueban.addAll(response.get(key));
            }
        }

        System.out.println("DESAPRUEBAN: " + desaprueban);
        System.out.println("APRUEBAN: " + aprueban);

    }
}
