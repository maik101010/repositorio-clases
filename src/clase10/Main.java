package src.clase10;

/**
 * Created by Michael Garcia on 28/08/24
 */
public class Main
{
    public static void main(String[] args)
    {
        UpdateClient updateClient = new UpdateClient();
        updateClient.updateClient("6");


        SelectClient selectClient = new SelectClient();
        selectClient.findAll();
        System.out.println("--------------");
        DeleteClient deleteClient = new DeleteClient();
//        deleteClient.deleteClient("4".concat(" SELECT * FROM clientes;"));
        deleteClient.deleteClient("4");
        selectClient.findAll();

//        InsertClient insertClient = new InsertClient();
//        insertClient.insertClient();
    }
}
