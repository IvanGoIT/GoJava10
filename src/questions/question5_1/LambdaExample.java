package questions.question5_1;

public class LambdaExample {

    static int count = 0;

    public static void main(String[] args) {
        Runnable lambda = () -> {
            if (count % 2 == 0) {
                System.out.println("hello world I'm lambda : " + count);
            }
            count++;
        };

        for(int i = 0; i < 10; i++)
            lambda.run();

        // -----------------------------------------------
        // -----------------------------------------------

        MyLambda myLambda1 = new MyLambda() {
            @Override
            public void run(String str) {
                System.out.println("my lambda 1 : " + str);
            }
        };

        MyLambda myLambda2 = (str) -> {
            System.out.println("my lambda 2 : " + str);
        };

        myLambda1.run("111 111 111");
        myLambda2.run("999 999 999");
    }
}
