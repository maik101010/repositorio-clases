package src.clase10;

import src.clase10.entidad.ClientEntity;
import src.clase9.ejemplo1.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Michael Garcia on 29/08/24
 */
public class TransactionsExample
{

    public static void insertarMuchosDatos(List<ClientEntity> clientes) throws SQLException
    {
        Connection connection = ConnectionMysql.connection();

        String queryInsert = "INSERT INTO clientes (nombre, edad) VALUES (?, ?)";
        PreparedStatement statement = connection.prepareStatement(queryInsert);

        connection.setAutoCommit(false); // Desactivar auto-commit para el batch
        int i = 0;
        for (ClientEntity client : clientes)
        {
            try
            {
                statement.setString(1, client.getNombre());
                statement.setInt(2, client.getEdad());
                statement.addBatch();
            } catch (SQLException e)
            {
                throw new RuntimeException(e);
            }
//            if (i == 3) throw new RuntimeException("Ocurrio una exception");
            i++;
        }

        int[] updateCounts = statement.executeBatch();
        connection.commit();

        System.out.println("Insertados " + updateCounts.length + " registros.");

        statement.close();
        connection.close();
    }

    public static void main(String[] args) throws SQLException
    {

        ClientEntity client1 = new ClientEntity(1, "Alice", 25);
        ClientEntity client2 = new ClientEntity(2, "Bob", 30);
        ClientEntity client3 = new ClientEntity(3, "Charlie", 22);
        ClientEntity client4 = new ClientEntity(4, "Diana", 28);
        ClientEntity client5 = new ClientEntity(5, "Edward", 35);
        ClientEntity client6 = new ClientEntity(6, "Fiona", 27);
        ClientEntity client7 = new ClientEntity(7, "George", 31);
        ClientEntity client8 = new ClientEntity(8, "Hannah", 29);
        ClientEntity client9 = new ClientEntity(9, "Ian", 26);
        ClientEntity client10 = new ClientEntity(10, "Jane", 33);
        List<ClientEntity> clientes = Arrays.asList(client1, client2, client3, client4, client5, client6, client7, client8, client9, client10);
        insertarMuchosDatos(clientes);
    }
}
