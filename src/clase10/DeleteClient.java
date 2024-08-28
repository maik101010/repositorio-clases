package src.clase10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Michael Garcia on 28/08/24
 */
public class DeleteClient
{

    String updateQuery = "DELETE from clientes WHERE id = ?";

    public void deleteClient(String id)
    {
        try
        {
            Connection connection = ConnectionMysql.connection();
            PreparedStatement statement = connection.prepareStatement(updateQuery);
            statement.setString(1, id);
            int execute = statement.executeUpdate();
            if (execute > 0)
            {
                System.out.println("Registro eliminado con exito!");
            }
            else
            {
                System.out.println("No se elimino");
            }

        } catch (SQLException e)
        {
            System.out.println("Ocurrio una exeption corriendo la consulta " + e.getMessage());
        }

    }
}
