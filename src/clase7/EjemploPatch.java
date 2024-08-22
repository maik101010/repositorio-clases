package src.clase7;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Michael Garcia on 22/08/24
 */
public class EjemploPatch
{
    public static void main(String[] args)
    {
        Path path = Paths.get("test/test.txt");

        System.out.println("-*-*-*-Métodos de Path-*-*-*-");
        System.out.println("getFileName(): " + path.getFileName());
        System.out.println("getName(0): " + path.getName(0));
        System.out.println("getNameCount(): " + path.getNameCount());
        System.out.println("subPath(0, 2): " + path.subpath(0, 2));
        System.out.println("getParent(): " + path.getParent());
        System.out.println("getRoot(): " + path.getRoot());
        System.out.println("toAbsolutePath(): " + path.toAbsolutePath());
        System.out.println("toFile(): " + path.toFile());
        System.out.println("normalize(): " + path.normalize());
        System.out.println("compareTo(): " + path.compareTo(Paths.get("C:\\Users")));
        System.out.println("endsWith(): " + path.endsWith("asdasdasd.txt"));
        System.out.println("resolve(): " + path.resolve("carp1\\carp2"));
    }

}
