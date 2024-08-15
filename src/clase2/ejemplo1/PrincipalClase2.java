package src.clase2.ejemplo1;

/**
 * Created by Michael Garcia on 13/08/24
 */
public class PrincipalClase2
{
    public static void main(String[] args)
    {
        Programador pr = new Programador("Den", "Luevano", 20333, "Victor", "Junior");

        Programador pr1 = new Programador("Oscar", "Luevano", 20333, "Victor", "Senior");
        Disenador dr = new Disenador("Steph", "Poblano", 25000, "Marcelino");

        System.out.println("-*-*-*-Probandon método heredado de Programador-*-*-*-");
        System.out.println(pr.getNombre() + " - "+ pr.getNivel());
        System.out.println(pr1.getNombre() + " - "+ pr1.getNivel());

        System.out.println("-*-*-*-Probando método heredado de Diseñador-*-*-*-");
        System.out.println(dr.getNombre());
    }
}
