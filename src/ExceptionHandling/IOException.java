package ExceptionHandling;

import java.io.File;

public class IOException {
    public static void main(String[] args) {
        File file = new File("abc.txt");

        // IOException
        // file.createNewFile(); //checked /compile time exception
    }
}
