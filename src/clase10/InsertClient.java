package src.clase10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Michael Garcia on 28/08/24
 */
public class InsertClient
{

    String queryInsert = "INSERT INTO clientes (nombre, edad) VALUES ('Duvan', 28)";

    public void insertClient()
    {
        try
        {
            Connection connection = ConnectionMysql.connection();
            Statement statement = connection.createStatement();
            int execute = statement.executeUpdate(queryInsert);
            if (execute > 0)
            {
                System.out.println("Registro insertado con exito!");
            }
            else
            {
                System.out.println("No se registro");
            }

        } catch (SQLException e)
        {
            System.out.println("Ocurrio una exeption corriendo la consulta " + e.getMessage());
        }

    }
}
