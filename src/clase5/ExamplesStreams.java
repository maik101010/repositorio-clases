package src.clase5;

import src.clase4.Persona;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static src.BuildPerson.buildList;

/**
 * Created by Michael Garcia on 20/08/24
 */
public class ExamplesStreams
{


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

        Function<Worker, Worker> applyUpperCaseToName = (var worker) -> new Worker(worker.getNombre().toUpperCase(), worker.getEdad() + 1,
                worker.getDireccion(), worker.getSexo(), worker.sueldo);

        Predicate<Worker> byAgeGreaterThan18 = (var worker) -> worker.getEdad() > 18;

        //set workers based on persons
        personas.forEach(persona -> workers.add(new Worker(persona.getNombre(),
                persona.getEdad(),
                persona.getDireccion(), persona.getSexo(), 100000)));

        Function<Worker, Worker> applyIncreaseSalaryByTwo = (var worker) ->
                new Worker(worker.getNombre(), worker.getEdad(),
                        worker.getDireccion(), worker.getSexo(), worker.sueldo * 2);
        //java 8 en adelante
        List<Worker> collect = workers.stream()
                .filter(byAgeGreaterThan18)
                .map(applyUpperCaseToName)
                .map(applyIncreaseSalaryByTwo)
                .toList();

        //java 7
        List<Worker> newList = new ArrayList<>();
        for (Worker worker : workers)
        {
            if (worker.getEdad() > 18)
            {
                String name = worker.getNombre();
                worker.setNombre(name.toUpperCase());
                int edad = worker.getEdad();
                edad++;
                worker.setEdad(edad);
                int nuevoSueldo = worker.sueldo * 2;
                worker.sueldo = nuevoSueldo;
                newList.add(worker);
            }
        }
        System.out.println(collect);
        System.out.println(newList);
        //.forEach(System.out::println);


        List<String> nombres = new ArrayList<>();
        Function<Persona, String> getNames = persona -> persona.getNombre();

        personas.stream()
                .map(getNames)
                .filter(personName -> personName.startsWith("M"))
                .forEach(persona -> nombres.add(persona));

        Consumer<String> consumer = (var name) -> System.out.println("Si se filtra ".concat(name));
        personas.stream()
                .map(getNames)
                .peek(name -> System.out.println("Antes de filtrar, nombre ".concat(name)))
                .filter(personName -> personName.startsWith("M"))
                .peek(consumer)
                .toList();


        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e));

//        System.out.println(listNames);

    }
}
