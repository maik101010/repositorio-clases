package src.clase2.ejemplo1;

/**
 * Created by Michael Garcia on 13/08/24
 */
public class Programador extends Empleado
{

    private String nivel;

    public Programador(String nombre, String apellido, double sueldo, String jefe, String nivel)
    {
        super(nombre, apellido, sueldo, jefe);
        this.nivel = nivel;
    }

    public String getNivel()
    {
        return nivel;
    }

}
