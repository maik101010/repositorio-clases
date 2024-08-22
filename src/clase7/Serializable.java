package src.clase7;

import java.io.*;

/**
 * Created by Michael Garcia on 22/08/24
 */
public class Serializable
{
    public static void main(String[] args)
    {
        // apuntar a un archivo existente
        String file = "files/serializable.txt";

        Persona p1 = new Persona("Edgardo", 28, "CDMX", 'M');

        // Serialización de objeto en formato máquina
        try (
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // Serializando objeto
            oos.writeObject(p1);
//            oos.writeObject(p2);
            System.out.println("Serialización completa");

        } catch (IOException ex) {
            System.out.println("Algo pasó con la serialización: " + ex);
        }

//                Serializacion objeto en formato json
//        try (PrintWriter out = new PrintWriter(new FileWriter(file)))
//        {
//            out.println(p1);
//            System.out.println("Serialización completa");
//        } catch (IOException ex)
//        {
//            System.out.println("Algo pasó con la serialización: " + ex);
//        }

    }
}
