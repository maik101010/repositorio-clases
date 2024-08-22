package src.clase7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Michael Garcia on 22/08/24
 */
public class Ejemplo2
{
    public static void main(String[] args)
    {
        // Debe existir un archivo para ser copiado, en este caso es prueba.txt
        String urlArchivo = "files/prueba.txt";
        // Debe cambiarse el nombre del archivo.txt, ya que este pruebados.txt ya está copiado
        String urlArchivoSalida = "files/pruebados.txt";

        try (
                FileChannel channel1 = new FileInputStream(urlArchivo).getChannel();
                FileChannel channel2 = new FileOutputStream(urlArchivoSalida).getChannel()) {

            // Crea un buffer para obtener el contenido del archivo
            ByteBuffer buff = ByteBuffer.allocate((int) channel1.size());
            // Llenamos el buffer con el contenido del archivo
            channel1.read(buff);
            // Cambiamos la posición del buffer al inicio
            buff.position(0);
            // Pasamos el contenido del archivo al channel de salida
            channel2.write(buff);
            System.out.println("Contenido copiado");

        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}
