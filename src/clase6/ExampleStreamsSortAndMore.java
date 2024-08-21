package src.clase6;

import src.BuildPerson;
import src.clase4.Persona;
import src.clase5.Worker;

import javax.naming.spi.DirObjectFactory;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Michael Garcia on 21/08/24
 */
public class ExampleStreamsSortAndMore
{
    public static void main(String[] args)
    {
        List<Persona> personas = BuildPerson.buildList();
//        System.out.println("Ejecutando comparable");
//        personas.stream().sorted().forEach(System.out::println);
//        System.out.println("Ejecutando comparator");
//        Comparator<Persona> comparator = (Persona persona, Persona persona2) ->  persona.getNombre().compareToIgnoreCase(persona2.getNombre());
//        Comparator<Persona> comparator = (Persona persona, Persona persona2) ->  persona.getDireccion().compareToIgnoreCase(persona2.getDireccion());
//        personas.stream().sorted(comparator).forEach(System.out::println);
//
//        long count = personas.stream()
//                .count();
//        System.out.println(count);

        List<Worker> workers = new ArrayList<>();
        personas.forEach(persona -> workers.add(new Worker(persona.getNombre(),
                persona.getEdad(),
                persona.getDireccion(), persona.getSexo(), 100000, persona.getCiudad())));

//        Function<Worker, Worker> applyIncreaseSalaryByTwo = (var worker) ->
//                new Worker(worker.getNombre(), worker.getEdad(),
//                        worker.getDireccion(), worker.getSexo(), worker.sueldo * 2);

//        int sum = workers.stream()
//                .mapToInt((worker -> worker.sueldo))
//                .sum();
//
//        OptionalDouble average = workers.stream()
//                .mapToInt((worker -> worker.getEdad()))
//                .average();
//        System.out.println(sum);
//        System.out.println(average.getAsDouble());
//        System.out.println(workers);


//        List<Worker> returnList = workers.stream().filter(worker -> worker.getNombre().startsWith("M"))
//                    .collect(Collectors.toList());
//        System.out.println(returnList);

        Comparator<Worker> comparator = (var worker1, var worker2) -> worker1.getNombre().compareTo(worker2.getNombre());
//        Comparator<Worker> comparator = Comparator.comparing(Persona::getNombre);
        try
        {
            Map<String, List<Worker>> groupByCity = workers
                    .stream()
                    .sorted(comparator)
//                .filter(worker -> worker.getNombre().startsWith("M"))
//                    .filter(worker -> !Objects.isNull(worker.getCiudad()))
                    .filter(worker -> !Objects.isNull(worker.getCiudad()))
                    .collect(Collectors.groupingBy(Persona::getCiudad));
        System.out.println(groupByCity);
        } catch (NullPointerException e)
        {
            System.out.println("Debes agregar al menos una llave a la ciudad ".concat(e.getMessage()));
        }


        Map<Boolean, List<Worker>> groupByAge = workers
                .stream()
                .collect(Collectors.partitioningBy(worker -> worker.getEdad() > 25));
        System.out.println(groupByAge);

        Function<Persona, String> function = (var persona)->{
          if (persona.getSexo()=='M')
            return "Es masculino";
          else if (persona.getNombre().startsWith("M")){
              return "Empieza con M";
          }else
              return "Default";
        };

        Stream<String> list = workers.stream()
                .map(function);

        Stream<String> listTwo = workers.stream()
                .map(Persona::getCiudad);

        System.out.println(listTwo);
        System.out.println(workers);

        Stream<String> concat = Stream.concat(list, listTwo);
        concat.forEach(System.out::println);


        Optional<Worker> possibleWorker = workers.stream()
                .sorted()
                .findFirst();
        if (possibleWorker.isPresent())
            System.out.println(possibleWorker);

        Optional<Worker> possibleAnyWorker = workers.stream()
                .findAny();
        System.out.println(possibleAnyWorker);


        boolean result = workers.stream()
                .anyMatch(worker -> worker.getCiudad().equalsIgnoreCase("barranquilla"));
        System.out.println(result);

        boolean noneMatch = workers.stream()
                .noneMatch(worker -> worker.getCiudad().equalsIgnoreCase("barranquilla"));
        System.out.println(noneMatch);

        boolean allMatch = workers.stream()
                .allMatch(worker -> worker.sueldo>1000);
        System.out.println(allMatch);

        Stream<Worker> takeWhile = workers.stream()
                .takeWhile(worker -> worker.getSexo()== 'F');
// java 7 version
//        for (Worker worker: workers){
//            if (worker.getSexo()!='F') break;
//            System.out.println(worker);
//        }
        takeWhile.forEach(System.out::println);

    }
}
