package lessons.lesson2;

public class OperatorsExample {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;

        int x = a + b;
        x = x - b;

        int value = b - 10;

        x -= b;
        x += b;
        x /= b;
        x *= b;

        float c = (float)((double)b / a);

        x = (10 + 10) * 2;

        x = 0;
        x = x + 1;
        x += 1;
        x++;    // постфиксный инкремент
        ++x;    // префиксный инкремент

        x = 0;
        value = x++;
        System.out.println("x = " + x);
        System.out.println("value  = " + value);

        x = 0;
        value = ++x;
        System.out.println("x = " + x);
        System.out.println("value2 = " + value);


        x = 0;
        value = ++x + x++;
        System.out.println("x = " + x);
        System.out.println("value3 = " + value);
    }
}
