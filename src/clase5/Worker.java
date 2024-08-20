package src.clase5;

import src.clase4.Persona;

/**
 * Created by Michael Garcia on 20/08/24
 */
public class Worker extends Persona
{
    int sueldo;

    public Worker(String nombre, int edad, String direccion, char sexo, int sueldo)
    {
        super(nombre, edad, direccion, sexo);
        this.sueldo = sueldo;
    }

    @Override
    public String toString()
    {
        return super.toString().concat(
                "sueldo=" + sueldo
                );
    }
}
