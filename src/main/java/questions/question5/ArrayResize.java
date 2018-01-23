package questions.question5;

public class ArrayResize {

    static int [] array = {};

    static int[] increaseArray(int[] array, int additionalLength) {
        int[] arrayNew = new int[array.length + additionalLength];

        for(int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        return arrayNew;
    }

    static void printArray(int[] array) {
        System.out.print("Array (length=" + array.length +  ") [ ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        printArray(array);

        array = increaseArray(array, 10);
        printArray(array);
    }
}
