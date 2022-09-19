package FileHandling;

import java.io.*;

public class BufferedInputOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("./src/FileHandling/java.txt");
        BufferedOutputStream stream = new BufferedOutputStream(fos);
        String txt = "Java is secured languange";
        stream.write(txt.getBytes());
        stream.close();
        fos.close();
    }
}
