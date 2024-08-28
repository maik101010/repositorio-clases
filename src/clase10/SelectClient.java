package src.clase10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Michael Garcia on 28/08/24
 */
public class SelectClient
{

    String querySelect = "SELECT * FROM clientes";

    public void findAll()
    {
        try
        {
            Connection connection = ConnectionMysql.connection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(querySelect);
            while (resultSet.next())
            {
                System.out.println(resultSet.getString("nombre") + " " + resultSet.getInt("edad") + " " + resultSet.getInt("id"));
            }

        } catch (SQLException e)
        {
            System.out.println("Ocurrio una exeption corriendo el select " + e.getMessage());
        }

    }
}
