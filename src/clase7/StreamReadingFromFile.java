package src.clase7;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamReadingFromFile
{


        public static void main(String[] args) {
            // Con System.getProperty("user.home"), obtenemos el path home de la máquina actual
            String home = System.getProperty("user.home");

            // Instancia de Path
            Path urlArchivo = Paths.get(home).resolve("prueba.txt");

            // Abrimos el archivo en un Stream
            try (Stream<String> lineas = Files.lines(urlArchivo)) {

                // Recorremos todo el Stream
                System.out.println("-*-*-*-Inicio de archivo-*-*-*-");
                lineas.forEach(System.out::println);
                System.out.println("-*-*-*-Fin de archivo-*-*-*-");

            } catch (IOException ex) {
                System.out.println("Error al eliminar: " + ex);
            }
        }
    }


