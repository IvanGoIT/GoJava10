package lessons.lesson5_3.files;

import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter {
    private String path;

    public MyFileWriter(String path) {
        this.path = path;
    }

    public boolean write(String text) {
        return write(text, false);
    }

    public boolean write(String text, boolean append) {
        try {
            FileWriter writer = new FileWriter(path, append);
            writer.write(text);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
