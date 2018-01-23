package lessons.lesson2;

public class LogicalOperatorSecondExample {

    public static void main(String[] args) {

        boolean t = true;
        boolean f = false;

        boolean result = t && f;

        System.out.println("t && t = " + (t && t));
        System.out.println("t && f = " + (t && f));
        System.out.println("f && t = " + (f && t));
        System.out.println("f && f = " + (f && f));

        System.out.println();

        System.out.println("t || t = " + (t || t));
        System.out.println("t || f = " + (t || f));
        System.out.println("f || t = " + (f || t));
        System.out.println("f || f = " + (f || f));

        System.out.println();

        // x [1000 : 2000]
        int x = 999;
        result = x >= 1000 && x <= 2000;

        System.out.println("x [1000 : 2000] =  " + result);
        System.out.println("x ![1000 : 2000] = " + !result);

        result = x < 1000 || x > 2000;
        System.out.println("x ![1000 : 2000] = " + result);


        boolean isLeft = x < 1000;
        boolean isCenter = x > 2000 && x < 4000;
        boolean isRight = x > 5000;

        boolean isGreen = isLeft || isCenter || isRight;
        boolean isGreen2 = x < 1000 || (x > 2000 && x < 4000) || x > 5000;

        System.out.println();
        System.out.println("x = " + x + "; isGreen  = " + isGreen);
        System.out.println("x = " + x + "; isGreen2 = " + isGreen2);
    }
}
