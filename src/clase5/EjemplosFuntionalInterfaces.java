package src.clase5;

import src.clase2.ejemplo4.Funcion;

import java.util.Locale;
import java.util.function.*;

/**
 * Created by Michael Garcia on 20/08/24
 */
public class EjemplosFuntionalInterfaces
{
    public static void main(String[] args)
    {
        //Use of predicate
        Predicate<String> predicate = (String value) -> false;
//        System.out.println(predicate.test("Michael"));
//        Predicate<Integer> predicateGreaterThan18 = (Integer value) -> value > 18;
//        System.out.println(predicateGreaterThan18.test(17));

        Predicate<String> p = (String parameter) -> parameter.length() < 5;

        Predicate<String> result = p.or(predicate);
        System.out.println(result.test("asdasdasdasd"));

//        String m1 = "michael";
//        String m2 = "michael";
//        System.out.println(m1==m2);

        Consumer<String> print = System.out::println;
        Consumer<Integer> printMethodReference = System.out::println;

        printMethodReference.accept(1);
        print.accept("Hola muchachos! dos");

        Function<Integer, String> function = (Integer n1) -> "Hello number ".concat(String.valueOf(n1));
        Function<String, Integer> convert = (String n1) -> Integer.parseInt(n1);
        System.out.println(convert.apply("123"));


        Supplier<StringBuilder> build = () -> new StringBuilder();
        System.out.println(build.get().append("Hola").append("mundo"));


        UnaryOperator<String> function1 = (String n1) -> n1.toUpperCase(Locale.ROOT);
        System.out.println(function1.apply("michael"));


        BiPredicate<String, String> ejemplo = (var n1, var n2) -> n1.equals(n2);

        System.out.println(ejemplo.test("test", "test"));

        BiFunction<Double, Double, Integer> biFunction = MethodsReferencesClass::myMethodReference;
        System.out.println(biFunction.apply(1.2, 2.3));

        ToIntFunction<Integer> sum3 = (var number) -> number+3;
        int primitive = sum3.applyAsInt(Integer.valueOf(2));
        Integer intObject = Integer.valueOf(2);
        System.out.println(primitive);

    }

    static class MethodsReferencesClass
    {
        static Integer myMethodReference(Double n1, Double n2)
        {
            return (int) (n1 + n2);
        }
    }
}


