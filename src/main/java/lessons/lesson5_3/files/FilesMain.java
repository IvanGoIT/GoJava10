package lessons.lesson5_3.files;

import java.io.File;
import java.io.FileNotFoundException;

public class FilesMain {

    static void writeExample() {
        MyFileWriter writer = new MyFileWriter("files" + File.separatorChar
                + "lesson5_3" + File.separatorChar
                + "inputExample2.txt");
        writer.write("123\n000\n   +++");
    }

    static void readExample() {
        MyFileReader reader = new MyFileReader("files" + File.separatorChar
                + "lesson5_3" + File.separatorChar
                + "readExample.txt");
        System.out.println(reader.read());
    }

    static void loadUserDataExample() {
        UserDataReader dataReader = new UserDataReader("files/lesson5_3/userData.txt");
        try {
            dataReader.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        dataReader.show();
    }

    public static void main(String[] args) {
        // writeExample();
        // readExample();
        loadUserDataExample();
    }
}
