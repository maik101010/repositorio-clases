package src.clase10;

import src.clase10.entidad.ClientEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michael Garcia on 28/08/24
 */
public class SelectClient
{

    String querySelect = "SELECT * FROM clientes";

    public List<ClientEntity> findAll()
    {
        List<ClientEntity> clientEntities = new ArrayList<>();
        try
        {
            Connection connection = ConnectionMysql.connection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(querySelect);
            ClientEntity newClient;
            while (resultSet.next())
            {
                newClient = new ClientEntity(resultSet.getInt("id"), resultSet.getString("nombre"), resultSet.getInt("edad"));
                clientEntities.add(newClient);
            }

        } catch (SQLException e)
        {
            System.out.println("Ocurrio una exeption corriendo el select " + e.getMessage());
        }
        return clientEntities;

    }
}
