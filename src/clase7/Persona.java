package src.clase7;

import java.io.Serializable;

/**
 * Created by Michael Garcia on 22/08/24
 */
public class Persona implements Serializable
{
    /*Se recomienda agregar su propio serialVersionUID*/
    private static final long serialVersionUID = 12L;

    private String nombre;
    private int edad;

    /*Se marca el atributo cómo transient porque quiero que omita la serialización en este atributo*/
    private transient String ciudadOrigen;
    private char sexo;

    public Persona(String nombre, int edad, String ciudadOrigen, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudadOrigen = ciudadOrigen;
        this.sexo = sexo;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public String getCiudadOrigen()
    {
        return ciudadOrigen;
    }

    public char getSexo()
    {
        return sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ciudadOrigen='" + ciudadOrigen + '\'' +
                ", sexo=" + sexo +
                '}';
    }

}
