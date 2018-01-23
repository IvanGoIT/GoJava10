package lessons.lesson3.arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int[] array2 = new int[4];
        int[] array = {0, 1 ,2, 10, -20, 150, 100500};

        array[1] = 100;

        // 1 - выполняется только 1 раз
        // 2 - выполняется каждый раз и проверяет надо ли продолжать выполнять итерации
        // 3 - выполняется по окончанию каждой итерации
        for (int i = 0; i < array.length; i++) { // начало итерации
            // итерация
            System.out.println(array[i]);
        } // конец интерации
    }
}
