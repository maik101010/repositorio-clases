package src.clase2.ejemplo1;

/**
 * Created by Michael Garcia on 13/08/24
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private double sueldo;
    private String jefe;

    public Empleado(String nombre, String apellido, double sueldo, String jefe) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.jefe = jefe;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public double getSueldo()
    {
        return sueldo;
    }

    public void setApellido(String myApellido)
    {
        this.apellido = apellido;
    }

}

