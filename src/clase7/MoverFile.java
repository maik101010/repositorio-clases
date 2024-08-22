package src.clase7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MoverFile
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
                /*Validamos que exista el archivo y la carpeta donde se moverá el archivo*/
                if (Files.exists(urlOriginal) && Files.exists(urlDestino)) {
                    /*Movemos el archivo con su nombre original*/
                    Files.move(urlOriginal, urlDestino.resolve(urlOriginal.getFileName()));
                    System.out.println("Se ha movido el archivo");
                }
            } catch (IOException ex) {
                System.out.println("Error al mover: " + ex);
            }
        }
    }


