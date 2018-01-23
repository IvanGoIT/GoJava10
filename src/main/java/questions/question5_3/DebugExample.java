package questions.question5_3;

import lessons.lesson5_3.files.MyFileReader;

public class DebugExample {

    public static void main(String[] args) {
        MyFileReader reader = new MyFileReader("files/question5_3/debugExample.txt");
        String str = reader.read();
        System.out.println(str);
    }
}
