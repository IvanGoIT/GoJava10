package lessons.lesson5_3.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserDataReader {
    private String path;

    private String userName;
    private int userAge;
    private String userFavoriteWord;
    private int[] array;

    public UserDataReader(String path) {
        this.path = path;
    }

    public void read() throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(path);
        Scanner scanner = new Scanner(stream);

        int arrayLength = scanner.nextInt();    // считали длинну массива
        array = new int[arrayLength];
        for(int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();       // считываем сам массив
        }
        scanner.nextLine();

        userName = scanner.nextLine();   // считываем имя пользователя
        userAge = scanner.nextInt();        // считываем возраст пользователя
        scanner.nextLine();
        userFavoriteWord = scanner.nextLine(); // считываем любимое слово пользователя
        scanner.close();
    }

    public void show() {
        System.out.println("User name:\t\t\t" + userName);
        System.out.println("User age: \t\t\t" + userAge);
        System.out.println("User favorite word:\t" + userFavoriteWord);
        System.out.println();
        System.out.println("Array length = " + array.length);
        for(int i = 0; i < array.length; i++) {
            System.out.print("["+i+"]" + array[i] + "   ");
        }
    }
}
