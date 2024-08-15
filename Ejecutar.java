/**
 * Created by Michael Garcia on 12/08/24
 */

import src.*;


public class Ejecutar
{
    public static void main(String[] args)
    {

        Persona persona1 = new Persona();
        persona1.setNombre("Samuel");
        persona1.setEdad(30);
        persona1.setSexo('H');

        System.out.println(persona1.getNombre());

        Persona persona2 = new Persona();
        persona2.setNombre("Andres");
        persona2.setEdad(25);
        persona2.setSexo('F');


    }
}
