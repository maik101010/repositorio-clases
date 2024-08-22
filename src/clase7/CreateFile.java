package src.clase7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile
{


        public static void main(String[] args) {
            // Con System.getProperty("user.home"), obtenemos el path home de la máquina actual
            String home = System.getProperty("user.home");

            // Instancia de Path
            String nombreArchivo = ("prueba.txt");
            Path url = Paths.get(home).resolve(nombreArchivo);
            System.out.println("Archivo: " + url);

            try {
                Files.createFile(url);
                System.out.println("Archivo creado");
            } catch (IOException ex) {
                System.out.println("Error al crear archivo: " + ex);
            }
        }
    }

