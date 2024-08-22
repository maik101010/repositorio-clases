package src.clase7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopiarFile
{


        public static void main(String[] args) {
            /*Con System.getProperty("user.home"), obtenemos el path home de la máquina actual*/
            String home = System.getProperty("user.home");

            /*Instancia de Path*/
            Path urlOriginal = Paths.get(home).resolve("prueba.txt");
            Path urlDestino = Paths.get(home).resolve("myNewFolder");
            System.out.println("Original: " + urlOriginal);
            System.out.println("Destino: " + urlDestino);

            try {
                /*Validamos que exista el archivo y la carpeta donde se copiará el archivo*/
                if (Files.exists(urlOriginal) && Files.exists(urlDestino)) {
                    /*Copiamos el archivo con su nombre original*/
                    Files.copy(urlOriginal, urlDestino.resolve(urlOriginal.getFileName()));
                    System.out.println("Se ha copiado el archivo");
                }
            } catch (IOException ex) {
                System.out.println("Error al copiar: " + ex);
            }
        }
    }


