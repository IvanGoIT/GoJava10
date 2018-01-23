package lessons.lesson2;

public class LogicalOperators {

    public static void main(String[] args) {

        boolean value = 10 < 100;

        System.out.println("10 < 100 = " + (10 < 100));
        System.out.println("10 > 100 = " + (10 > 100));

        System.out.println();

        System.out.println("10 == 100 = " + (10 == 100));
        System.out.println("10 == 10 = " + (10 == 10));

        System.out.println();

        System.out.println("10 != 100 = " + (10 != 100));
        System.out.println("100 != 100 = " + (100 != 100));

        System.out.println();

        System.out.println("10 <= 100 = " + (10 <= 100));
        System.out.println("10 >= 100 = " + (10 >= 100));

        System.out.println();

        System.out.println("10 <= 10 = " + (10 <= 10));
        System.out.println("10 >= 10 = " + (10 >= 10));

        System.out.println();
        System.out.println();

        System.out.println("10 > 10 = " + (10 > 10));
        System.out.println("!(10 > 10) = " + !(10 > 10));

        System.out.println();

        value = false;
        System.out.println("value = " + value);
        System.out.println("!value = " + !value);
    }
}
