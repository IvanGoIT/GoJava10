package questions.question5_3;

public class Question2 {
    public static void main(String[] args) {
        ClassD d = new ClassD();
        ClassD d2 = new ClassD();

        d.a = 1;
        d2.a = 10;

        d.count(d2); // d.a += d2.a;
        System.out.println(d.a);
    }
}
