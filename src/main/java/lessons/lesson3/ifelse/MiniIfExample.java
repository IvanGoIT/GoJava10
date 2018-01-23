package lessons.lesson3.ifelse;

import java.util.Scanner;

public class MiniIfExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        // value = true / false ? positive_result : negative_result;


        // ------------------------------------------
        System.out.println(str.length() == 5 ? "ДЖЕКПОТ!!!" : "провал :(");
        // ------------------------------------------

        // ------------------------------------------
        String resultV1 = null;
        if (str.length() == 5) {
            resultV1 = "ДЖЕКПОТ!!!";
        } else {
            resultV1 = "провал :(";
        }
        System.out.println(resultV1);
        // ------------------------------------------

        //  ------------------------------------------
        //  ------------------------------------------
        //  ------------------------------------------

        // ------------------------------------------
        System.out.println(str.length() == 5 ? "ДЖЕКПОТ!!!" : (str.length() == 3 ? "провал" : ""));
        // ------------------------------------------

        // ------------------------------------------
        if (str.length() == 5) {
            System.out.println("ДЖЕКПОТ!!!");
        } else if (str.length() == 3) {
            System.out.println("провал :(");
        }
        // ------------------------------------------
    }
}
