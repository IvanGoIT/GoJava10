package questions.question2;

import java.util.Scanner;

public class CheckInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str;
        int value = 0;

        while(true) {
            System.out.println("Введите число");
            str = scanner.nextLine();
            try {
                value = Integer.parseInt(str);
                break;
            } catch (Exception e) {
                System.err.println("Это не число :(");
            }
        }

        System.out.println("value = " + value);
    }
}
