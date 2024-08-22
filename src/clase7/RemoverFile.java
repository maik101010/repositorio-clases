package src.clase7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RemoverFile
{

        public static void main(String[] args) {
            /*Con System.getProperty("user.home"), obtenemos el path home de la máquina actual*/
            String home = System.getProperty("user.home");

            /*Instancia de Path*/
            Path urlArchivo = Paths.get(home).resolve("prueba.txt");

            try {
                /*Si usamos el delete tenemos que validar si existe el archivo*/
                if (Files.exists(urlArchivo)) {
                    Files.delete(urlArchivo);
                    System.out.println("Se ha eliminado el archivo");
                }else{
                    System.out.println("No existe el archivo");
                }
                /*Si usamos el deleteIfExists() no es necesario validar*/
//                Files.deleteIfExists(urlArchivo);

            } catch (IOException ex) {
                System.out.println("Error al eliminar: " + ex);
            }
        }
    }


