package lessons.lesson9;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.Scanner;

public class GoogleSearchExample {

    static String search(String query) throws UnirestException {
        HttpResponse<String> response = Unirest.get("http://www.google.com.ua/{type}")
                .routeParam("type", "search")
                .queryString("q", query)
                .asString();

        return response.getBody();
    }

    public static void main(String[] args) throws UnirestException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите запрос");
        String query = sc.nextLine();

        String result = search(query);
        System.out.println(result);
    }
}
