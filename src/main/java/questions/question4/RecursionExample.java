package questions.question4;

public class RecursionExample {
    static int sum(int x) {
        if (x <= 0) return x;
        return sum(x - 1) + x;
    }

    public static void main(String[] args) {
        int x = 30;
        System.out.println("sum(" + x + ") = " + sum(x));
        for(int i = 0; i < 100; i++) {
            System.out.println("sum(" + i + ") = " + sum(i));
        }
    }
}
