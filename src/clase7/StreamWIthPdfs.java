package src.clase7;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamWIthPdfs
{

        public static void main(String[] args) {
            // Con System.getProperty("user.home"), obtenemos el path home de la máquina actual
            String home = System.getProperty("user.home");

            // Instancia de Path
            Path urlArchivo = Paths.get(home).resolve("Downloads");

            // Usamos el método walk()
            try (Stream<Path> contenido = Files.walk(urlArchivo)) {
                // Buscando pdf en la raíz de user.home
                contenido.filter(t -> t.toString().endsWith(".pdf"))
                        .forEach(System.out::println);

            } catch (IOException ex) {
                System.out.println("Error al buscar en raíz: " + ex);
            }
        }
    }


