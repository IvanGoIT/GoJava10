package lessons.lesson4;

public class MethodExample {

    public static void printHello() {
        System.out.println("Hello");
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static String arrayToString(int[] arr) {
        return arrayToString(arr, arr.length);
    }

    public static String arrayToString(int[] arr, int count) {
        if (count < 0) throw new IllegalArgumentException("count < 0 !!!");
        String result = "";
        for(int i = 0; i < arr.length && i < count; i++)
            result += arr[i] + " ";
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 10, 150};
        int[] array2 = {10, 20, 30, 30, 0, -150};

        // String strArray = arrayToString(array);
        // System.out.println(strArray);
        // printArray(array);

        // System.out.println(arrayToString(array2));

        System.out.println(arrayToString(array, 100) + "\n" + arrayToString(array2, 3));
    }
}
