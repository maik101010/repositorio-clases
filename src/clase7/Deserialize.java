package src.clase7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by Michael Garcia on 22/08/24
 */
public class Deserialize
{

    public static void main(String[] args)
    {
        String urlArchivo = "files/serializable.txt";

        // Código para deserialización
        try (
                FileInputStream fis = new FileInputStream(urlArchivo);
                ObjectInputStream ois = new ObjectInputStream(fis))
        {
            // Obteniendo objeto del archivo
            Persona pDes = (Persona) ois.readObject();
            System.out.println("-*-*-*-Persona deserializada-*-*-*-");
            System.out.println(pDes);

        } catch (IOException | ClassNotFoundException ex)
        {
            System.out.println("Algo pasó con la deserialización: " + ex);
        }
    }
}
