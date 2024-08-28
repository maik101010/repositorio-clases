package src.clase10.entidad;

/**
 * Created by Michael Garcia on 28/08/24
 */
public class ClientEntity
{
    private int id;
    private String nombre;
    private int edad;

    public ClientEntity(int id, String nombre, int edad)
    {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId()
    {
        return id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    @Override
    public String toString()
    {
        return "ClientEntity{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
