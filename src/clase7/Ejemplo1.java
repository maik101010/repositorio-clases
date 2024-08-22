package src.clase7;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by Michael Garcia on 22/08/24
 */
public class Ejemplo1
{
    public static void main(String[] args)
    {
        String urlFile = "files/test.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(urlFile)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }
}
