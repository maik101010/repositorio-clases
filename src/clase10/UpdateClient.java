package src.clase10;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Michael Garcia on 28/08/24
 */
public class UpdateClient
{

    String updateQuery = "UPDATE clientes SET nombre = 'Diana' WHERE id = ";

    public void updateClient(String id)
    {
        try
        {
            Connection connection = ConnectionMysql.connection();
            Statement statement = connection.createStatement();
            int execute = statement.executeUpdate(updateQuery.concat(id));
            if (execute > 0)
            {
                System.out.println("Registro actualiza con exito!");
            }
            else
            {
                System.out.println("No se actualizo");
            }

        } catch (SQLException e)
        {
            System.out.println("Ocurrio una exeption corriendo la consulta " + e.getMessage());
        }

    }
}
