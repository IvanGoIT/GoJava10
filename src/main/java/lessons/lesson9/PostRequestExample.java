package lessons.lesson9;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class PostRequestExample {
    public static void main(String[] args) throws UnirestException {
        HttpResponse<String> jsonResponse = Unirest.post("http://httpbin.org/post")
                .header("accept", "application/json")
                .body("{\"parameter\":\"value\", \"foo\":\"bar\"}")
                .asString();

        System.out.println(jsonResponse.getBody());
    }
}
