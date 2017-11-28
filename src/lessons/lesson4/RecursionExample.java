package lessons.lesson4;

public class RecursionExample {

    static String printNumbers(int n) {
        if (n < 0) return "";
        String str = printNumbers(n - 1);
        return str + " " + n;
    }

    static int factorial(int n) {
        if (n <= 0) return 1;
        int value = factorial(n - 1);
        return value * n;
    }

    public static void main(String[] args) {
        String str = printNumbers(10);
        System.out.println(str);

        for(int i = 0; i < 13; i++) {
            System.out.println("Factorial("+i+") = " + factorial(i));
        }
    }

    static void superHard() {
        while(true){
            //
        }
    }
}
