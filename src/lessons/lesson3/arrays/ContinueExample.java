package lessons.lesson3.arrays;

public class ContinueExample {

    public static void main(String[] args) {

        int[] array = {0, 1, -2, -3, 100, 200, -1000, -5, 0, -10};

        int sum = 0;

        // -----------------------------------------
        for(int value : array) {
            if (value <= 0) {
                continue;
            }
            sum += value;
        }
        // -----------------------------------------

        // -----------------------------------------
//        for(int value : array) {
//            if (value > 0) {
//                sum += value;
//            }
//        }
        // -----------------------------------------

        System.out.println("Sum:" + sum);
    }
}
