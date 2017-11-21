package lessons.lesson3.ifelse;

import java.util.Scanner;

public class IfElseExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("число " + x + " кратно двойке");
        } else {
            System.out.println("число " + x + " не кратно двум");
        }
    }
}
