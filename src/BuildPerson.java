package src;

import src.clase4.Persona;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Michael Garcia on 21/08/24
 */
public class BuildPerson
{
    public static List<Persona> buildList()
    {
        return Arrays.asList(
                new Persona("Martha", 22, "No aplica", 'F', "Medellin"),
                new Persona("Alison", 33, "No aplica", 'F', "Bogota"),
                new Persona("Jose", 28, "Avenida siempre viva 123", 'M', "Medellin"),
                new Persona("Miguel", 35, "Manzana H casa 33", 'M', "Bogota"),
                new Persona("Michael", 28, "Carrera 3 123", 'M', "Venadillo"),
                new Persona("Johana", 14, "No aplica", 'F', "Pereira"),
                new Persona("Manuel", 36, "No aplica", 'M', "Bogota"),
                new Persona("Martha2", 33, "No aplica", 'F', "Cali")
        );
    }
}
