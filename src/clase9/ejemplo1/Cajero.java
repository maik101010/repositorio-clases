package src.clase9.ejemplo1;

/**
 * Created by Michael Garcia on 26/08/24
 */
public class Cajero extends Thread

{
    protected String nameWorker;
    protected Client client;
    public Cajero(String nameWorker, Client client){
        this.client = client;
        this.nameWorker = nameWorker;
    }

    @Override
    public String toString()
    {
        return "Cajero{" +
                "nombre='" + nameWorker + '\'' +
                ", cliente=" + client +
                '}';
    }



}
