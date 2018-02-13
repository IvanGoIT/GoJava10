package lessons.lesson9.youtube;

import com.mashape.unirest.http.exceptions.UnirestException;
import lessons.lesson9.youtube.entity.Item;
import lessons.lesson9.youtube.entity.ResponseSearch;
import lessons.lesson9.youtube.entity.SnippetVideo;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws UnirestException {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Что искать?");
            String query = sc.nextLine();

            ResponseSearch responseSearch = YouTubeAPI.search(query, 5);

            for (int i = 0; i < responseSearch.items.length; i++) {
                System.out.println("Title -------- " + responseSearch.items[i].snippet.title);
                System.out.println("Descriptin --- " + responseSearch.items[i].snippet.description);
                System.out.println();
            }

            System.out.println(responseSearch);
            System.out.println("\n\n\n\n\n\n");
        }
    }
}
