package src.clase7;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EjemploExistFile
{
        public static void main(String[] args) {
            /*Con System.getProperty("user.home"), obtenemos el path home de la máquina actual*/
            String home = System.getProperty("user.home");

            /*Instancia de Path*/
            Path url = Paths.get(home);
            System.out.println("URL: " + home);

            System.out.println("¿El archivo/directorio existe?: " + Files.exists(url));
        }
    }


