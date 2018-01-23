package lessons.lesson3.ifelse;

import java.util.Scanner;

public class IfElseIfExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        // строки длинной 5 символов == джекпот
        // строки длинной 3 символов == провал

        int length = str.length();
        System.out.println("Длинна строки = " + length);

        if (length == 5) {
            System.out.println("ДЖЕКПОТ!!!");
        } else if (length == 3) {
            System.out.println("провал :(");
        }
    }
}
