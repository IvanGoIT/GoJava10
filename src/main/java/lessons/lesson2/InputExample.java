package lessons.lesson2;

import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // -----------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя:");
        String userName = scanner.nextLine();

        System.out.println("Введите X:");
        int x = scanner.nextInt();

        System.out.println("Спасибо " + userName + ", вы ввели X = " + x);
        // -----------------------------------------------------


        System.out.println("Введите redZoneLeft redZoneRight redZone2Left redZone2Right:");
        int redZoneLeft = scanner.nextInt();
        int redZoneRight = scanner.nextInt();
        int redZone2Left = scanner.nextInt();
        int redZone2Right = scanner.nextInt();

        boolean isLeft = x < redZoneLeft;
        boolean isCenter = x > redZoneRight && x < redZone2Left;
        boolean isRight = x > redZone2Right;

        // не от 1000 до 2000, и не от 4000 до 5000
        boolean isGreen = isLeft || isCenter || isRight;

        System.out.println("X входит в зеленый диапазон? - " + isGreen);
        System.out.println("Спасибо " + userName + ", что пользовались нашей программой :)");
    }
}
