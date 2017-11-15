package lessons.lesson2;

public class BinaryOperatorsExample {
    public static void main(String[] args) {
        // 0000 = 0
        // 0001 = 1
        // 0010 = 2
        // 0011 = 3
        // 0100 = 4

        // 0 = false
        // 1 = true

        int x = 2;  // 0010
        int y = 4;  // 0400

        int a = x | y;

        System.out.println("2 | 0 = " + (2 | 0));
        // 2 | 0
        // 0010
        // 0000
        // ----
        // 0010

        System.out.println("2 | 4 = " + (2 | 4));
        // 2 | 4
        // 0010
        // 0100
        // ----
        // 0110


        System.out.println("200 | 1234 = " + (200 | 1234));


        System.out.println("2 & 4 = " + (2 & 4));
        // 2 & 4
        // 0010
        // 0100
        // ----
        // 0000

        System.out.println("13 & 7 = " + (13 & 7));
        // 13 & 7
        // 1101
        // 0111
        // ----
        // 0101


        System.out.println("200 & 1234 = " + (200 & 1234));

        // 00000000000000000000000000000001

        int flag = 0b00000001;

        // >>
        // <<

        System.out.println("1 << 3 = " + (1 << 3));
        System.out.println("1 << 4 = " + (1 << 4));
        System.out.println("1 << 5 = " + (1 << 5));
        System.out.println("2 << 3 = " + (2 << 3));
        System.out.println("2 << 4 = " + (2 << 4));
        System.out.println("2 << 5 = " + (2 << 5));

    }
}
