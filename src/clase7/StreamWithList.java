package src.clase7;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamWithList
{

        public static void main(String[] args) {
            // Con System.getProperty("user.home"), obtenemos el path home de la máquina actual
            String home = System.getProperty("user.home");

            // Instancia de Path
            Path urlArchivo = Paths.get(home.concat("/myNewFolder"));

            // Usamos el método list()
            try (Stream<Path> contenido = Files.list(urlArchivo)) {
                // Buscando txt de la raíz de user.home
                System.out.println("init");

                contenido.filter(t -> t.toString().endsWith(".txt"))
                        .forEach(System.out::println);

            } catch (IOException ex) {
                System.out.println("Error al buscar en raíz: " + ex);
            }
        }
    }


