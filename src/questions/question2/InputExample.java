package questions.question2;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пожалуйста ваше имя:");
        String name = scanner.nextLine();

        System.out.println("Введите пожалуйста ваше любимое число:");
        int favoriteNumber = scanner.nextInt();

        System.out.println("Спасибо " + name);
        System.out.println("Ваше любимое число - " + favoriteNumber);
    }
}
