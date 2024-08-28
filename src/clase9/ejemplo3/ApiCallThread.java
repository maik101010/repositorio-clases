package src.clase9.ejemplo3;

/**
 * Created by Michael Garcia on 27/08/24
 */

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class ApiCallThread extends Thread
{

    private final String apiUrl;
    private String apiResponse;

    public ApiCallThread(String apiUrl)
    {
        this.apiUrl = apiUrl;
    }

    @Override
    public void run()
    {
        HttpResponse<String> response = null;
        try
        {
            for (int i = 0; i < 5; i++)
            {
                HttpClient client = HttpClient.newBuilder()
                        .connectTimeout(Duration.ofSeconds(10))
                        .build();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(new URI(apiUrl))
                        .GET()
                        .build();
                Thread.sleep(300);

                response = client.send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(i + " Response from " + apiUrl + ": " + response.body() + " " + this.getName());
            }

        } catch (Exception e)
        {
            System.err.println("Error calling API: " + e.getMessage());
        }
        apiResponse = response.body();
    }

    public String getApiResponse()
    {
        return this.apiResponse;
    }


}
