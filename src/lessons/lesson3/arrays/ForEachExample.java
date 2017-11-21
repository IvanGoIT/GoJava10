package lessons.lesson3.arrays;

public class ForEachExample {

    public static void main(String[] args) {

        String[] array = {"abc", "aaa", "000", "www"};

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for(String value : array) {
            System.out.println(value);
        }
    }
}
