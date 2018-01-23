package lessons.lesson3.arrays;

import java.util.Scanner;

public class BreakExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {0, 1, 2, 3, 100, 200, 1000, -5, 0, -10};

        int x = scanner.nextInt();

        for(int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("X найден. Его индекс = " + i);
                break;
            }
        }

        System.out.println("Конец");
    }
}
