package src.clase7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFolder
{

        public static void main(String[] args) {
            /*Con System.getProperty("user.home"), obtenemos el path home de la máquina actual*/
            String home = System.getProperty("user.home");

            /*Instancia de Path*/
            String carpeta = "myNewFolder";
            Path url = Paths.get(home).resolve(carpeta);
            System.out.println("Directorio: " + url);

            try {
                /*Crea un sólo directorio*/
                Files.createDirectory(url);
                //Eliminando carpeta/files
//                Files.delete(url);

                /*Crea múltiples directorios*/
                //Files.createDirectories(url.resolve("carp2/carp3/carp4"));
                System.out.println("Directorios creados");
            } catch (IOException ex) {
                System.out.println("Error al crear directorios: " + ex);
            }
        }
    }


