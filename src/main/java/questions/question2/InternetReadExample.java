package questions.question2;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class InternetReadExample {

    public static void main(String[] args) throws URISyntaxException, IOException {
        URL address = new URL("https://raw.githubusercontent.com/IvanGoIT/GoJava10/master/src/questions/question2/InputExample.java");
        Scanner scanner = new Scanner(new BufferedInputStream(address.openStream()));

        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
