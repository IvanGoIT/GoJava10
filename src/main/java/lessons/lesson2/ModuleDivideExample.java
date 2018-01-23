package lessons.lesson2;

public class ModuleDivideExample {
    public static void main(String[] args) {
        // %

        System.out.println("5 % 2 = " + (5 % 2));

        // 5 = 1 1 1 1 1
        // 2 = 1 1
        // % = 5 - 4
        //     11 11 1

        System.out.println("20 % 3 = " + (20 % 3));

        System.out.println();

        System.out.println("100 % 2 = " + (100 % 2));
        System.out.println("122 % 2 = " + (122 % 2));
        System.out.println("9 % 2 = " + (9 % 2));
        System.out.println("13 % 2 = " + (13 % 2));

        System.out.println();

        System.out.println("13 % 13 = " + (13 % 13));
        System.out.println("100 % 10 = " + (100 % 10));
        System.out.println("5 % 1 = " + (5 % 1));
        System.out.println("5 % 6 = " + (5 % 6));

        System.out.println();

        System.out.println("2.6 % 1.3 = " + (2.6f % 1.3f));
        System.out.println("5.0 % 2.5 = " + (5.0f % 2.5f));
        System.out.println("6.0 % 2.5 = " + (6.0f % 2.5f));
    }
}
