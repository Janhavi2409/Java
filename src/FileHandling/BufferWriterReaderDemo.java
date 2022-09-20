package FileHandling;

import java.io.*;

public class BufferWriterReaderDemo {
    public static void main(String[] args) throws IOException {
        String path = "./src/FileHandling/java.txt";
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Java is Object-Oriented Language");
        bufferedWriter.close();
//        PdfWriter pdfWriter = new PdfWriter("./src/FileHandling/pdf.pdf");
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int i = bufferedReader.read();
        while (i > 0) {
            System.out.print((char) i);
            i = bufferedReader.read();
        }
        bufferedReader.close();
        fileReader.close();

    }
}
