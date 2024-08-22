package src.clase7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class StreamWithFiles
{

        public static void main(String[] args) {
            // Con System.getProperty("user.home"), obtenemos el path home de la máquina actual
            String home = System.getProperty("user.home");

            // Instancia de Path, debe existir el archivo en la maquina actual
            Path urlArchivo = Paths.get(home).resolve("prueba.txt");

            try {
                // Lista que se agregará al archivo
                List<String> lineas = new ArrayList<>();
                lineas.add("Michael");
                lineas.add("Oscar");
                lineas.add("Daniel");
                lineas.add("Saray");
                lineas.add("Camilo");
                lineas.add("Carlos munoz");

                // Le indicamos el url, la colección/bytes y el tipo de apertura del archivo
                // (en este caso le indicamos que conserve el contenido del archivo)
                Files.write(urlArchivo, lineas, StandardOpenOption.APPEND);
                System.out.println("Archivo escrito");

            } catch (IOException ex) {
                System.out.println("Error al eliminar: " + ex);
            }
        }
    }


