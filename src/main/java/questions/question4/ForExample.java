package questions.question4;

import java.util.Scanner;

public class ForExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int res = 0; res < x; res++) {
            System.out.println(res);
        }
    }
}
