package lessons.lesson9;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestExample {
    public static void main(String[] args) throws UnirestException {
        HttpResponse<String> response = Unirest.get("http://unirest.io/java.html")
                .asString();

        System.out.println("HTTP response code: " + response.getStatus());
        System.out.println("HTTP response body:\n" + response.getBody());
    }
}
