package questions.question6;

import java.io.*;

public class FileDescriptionExample {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(new File("files/question5_3/debugExample.txt"));

        char[] buffer = new char[128];

        while(fileReader.ready()) {
            fileReader.read(buffer, 0, buffer.length);

            for(char c : buffer) {
                System.out.print(c);
            }
        }
    }
}
