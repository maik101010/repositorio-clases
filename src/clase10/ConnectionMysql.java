package src.clase10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Michael Garcia on 28/08/24
 */
public class ConnectionMysql
{
    public static Connection connection()
    {
        /* Cambiar los datos por los suyos */
        String urlConexion = "jdbc:mysql://localhost:3306/prueba";
        String user = "test";
        String password = "1234";
        Connection conn = null;
        /* Creamos la conexión pasándole el url, user y password */
        try
        {
            conn = DriverManager.getConnection(urlConexion, user, password);
            /* Preguntamos si existe conexión */
            if (!conn.isClosed())
            {
                return conn;
            }

        } catch (SQLException ex)
        {
            System.out.println("Error en la conexión: " + ex);
        }
        System.out.println("Hubo un error de conexion");
        return conn;
    }
}
