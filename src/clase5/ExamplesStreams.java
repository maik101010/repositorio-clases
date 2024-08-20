package src.clase5;

import src.clase4.Persona;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Michael Garcia on 20/08/24
 */
public class ExamplesStreams
{
    static List<Persona> buildList()
    {
        return Arrays.asList(
                new Persona("Martha", 22, "No aplica", 'F'),
                new Persona("Jose", 28, "Avenida siempre viva 123", 'M'),
                new Persona("Miguel", 35, "Manzana H casa 33", 'M'),
                new Persona("Alison", 33, "No aplica", 'F'),
                new Persona("Andrea", 18, "Carrera 3 123", 'F'),
                new Persona("Johana", 14, "No aplica", 'F'),
                new Persona("Manuel", 36, "No aplica", 'M'),
                new Persona("Martha2", 33, "No aplica", 'F')
        );
    }

    public static void main(String[] args)
    {
        List<Persona> personas = buildList();

//        //iteration without streams
//        System.out.println("---Iteration with foreach-----");
//        for (Persona p : personas)
//        {
//            if (p.getEdad() > 18) System.out.println(p);
//        }
//        //iteration without streams
//        System.out.println("---Iteration with for-----");
//        for (int i = 0; i < personas.size(); i++)
//        {
//            System.out.println(personas.get(i));
//        }
//        System.out.println("-----Iteration with Iterator----");
//        Iterator<Persona> iterator = personas.iterator();
//        while (iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }

        System.out.println("-----Iteration with streams----");
//        Consumer<Persona> consumer = (var p) -> System.out.println(p);
//        personas.stream().forEach(persona -> System.out.println(persona));

//        personas.stream().forEach(System.out::println);
//        personas.forEach(consumer);
        Predicate<Persona> predicateEdad = (var persona) -> persona.getEdad() > 18;
//        Optional<Persona> first = personas.stream().filter(predicate).findFirst();
        Optional<Persona> first = personas.stream().filter(predicateEdad).findAny();
        Boolean result = personas.stream().anyMatch(predicateEdad);
//        System.out.println(result);

        if (personas.stream().anyMatch(predicateEdad))
        {
            Optional<Persona> second = personas.stream().filter(predicateEdad).findAny();
//            System.out.println(second.get());
        }

//        if (personas.stream().noneMatch(persona -> (persona.getNombre().startsWith("X")))){
//            System.out.println("Ningun nombre empieza con X");
//        }
//        personas.stream()
//                .filter(predicateEdad)
//                .filter(persona -> persona.getDireccion().length()>10)
//                .forEach(System.out::println);

        List<Worker> workers = new ArrayList<>();

        Function<Worker, Worker> function = (var worker) -> new Worker(worker.getNombre().toUpperCase(), worker.getEdad() + 1,
                worker.getDireccion(), worker.getSexo(), worker.sueldo);

        Predicate<Worker> predicateByAge = (var worker) -> worker.getEdad() > 18;

        //set workers based on persons
        personas.forEach(persona -> workers.add(new Worker(persona.getNombre(),
                persona.getEdad(),
                persona.getDireccion(), persona.getSexo(), 100000)));

        Function<Worker, Worker> functionApplyIncreaseSalary = (var worker) ->
                new Worker(worker.getNombre(), worker.getEdad(),
                        worker.getDireccion(), worker.getSexo(), worker.sueldo * 2);

        workers.stream()
                .filter(predicateByAge)
                .map(function)
                .map(functionApplyIncreaseSalary)
                .forEach(System.out::println);

    }
}
