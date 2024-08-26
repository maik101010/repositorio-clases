package src.clase9.ejemplo1;

import java.util.List;

/**
 * Created by Michael Garcia on 26/08/24
 */
public class Client
{
    private String name;
    private List<String> products;

    public String getNombre()
    {
        return name;
    }

    public void setNombre(String nombre)
    {
        this.name = nombre;
    }

    public List<String> getProductos()
    {
        return products;
    }

    public void setProductos(List<String> productos)
    {
        this.products = productos;
    }

    @Override
    public String toString()
    {
        return "Cliente{" +
                "nombre='" + name + '\'' +
                ", productos=" + products +
                '}';
    }
}
