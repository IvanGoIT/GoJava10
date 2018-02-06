package lessons.lesson9;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.*;

public class HTTPDownloadExample {

    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        Callable<String> httpRequest = () -> {
            URL url = new URL("http://google.com");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            InputStream inputStream = con.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);

            String html = "";
            int b = 0;
            while((b = reader.read()) != -1) {
                html += (char)b;
            }
            return html;
        };

        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<String> future = service.submit(httpRequest);
        System.out.println(future.get());
    }
}
