package src.clase4;

/**
 * Created by Michael Garcia on 15/08/24
 */
public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    private String direccion;
    private char sexo;

    private String ciudad;

    public Persona(String nombre, int edad, String direccion, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String direccion, char sexo, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.sexo = sexo;
        this.ciudad = ciudad;
    }


    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public char getSexo()
    {
        return sexo;
    }

    public void setSexo(char sexo)
    {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad()
    {
        return ciudad;
    }

    public void setCiudad(String ciudad)
    {
        this.ciudad = ciudad;
    }

    @Override
    public int compareTo(Persona o) {
        return this.nombre.compareToIgnoreCase(o.getNombre());
    }

    @Override
    public String toString()
    {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", sexo=" + sexo +
                '}';
    }
}
