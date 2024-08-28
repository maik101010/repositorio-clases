package src.clase10;

import src.clase10.entidad.ClientEntity;

import java.util.List;
import java.util.function.BinaryOperator;

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
        selectClient.findAll().forEach(System.out::println);
        System.out.println("--------------");
        DeleteClient deleteClient = new DeleteClient();
//        deleteClient.deleteClient("4".concat(" SELECT * FROM clientes;"));
        deleteClient.deleteClient("4");
        selectClient.findAll().forEach(System.out::println);


        List<Integer> collect = selectClient.findAll().stream().map(ClientEntity::getEdad).toList();
        BinaryOperator<Integer> binaryOperator = Integer::sum;
        long count = collect.stream().reduce(1, binaryOperator);
        System.out.println(count);

//        InsertClient insertClient = new InsertClient();
//        insertClient.insertClient();
    }
}
