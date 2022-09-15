package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {
        String fileName = "./src/FileHandling/welcome.txt";
        FileWriter fw = new FileWriter(fileName);
        fw.write("Welcome To 2022");
        //fw.close();
        fw.write("\nHello file");
        System.out.println();
        fw.close();

        FileReader fr = new FileReader(fileName);
        System.out.print((char) fr.read());
        int i = fr.read();
        while (i > 0) {
            System.out.print((char) i);
            i = fr.read();
//            System.out.print(i);
        }
    }
}
