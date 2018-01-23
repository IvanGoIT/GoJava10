package lessons.lesson3;

import java.util.Scanner;

public class BubbleSortExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ввод длинны массива
        int length = scanner.nextInt();
        // создание массива введенной длины
        int[] array = new int[length];

        // ввод элементов массива
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        // сортировка пузырьком
        for(int i=0; i < length; i++){
            for(int j=1; j < (length-i); j++){
                if(array[j-1] > array[j]){
                    //swap elements
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }

        // вывод результата на экран
        for(int value : array) {
            System.out.print(value + " ");
        }
    }
}
