package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileMethods {
    public static void main(String[] args) {
        File file = new File("./src/FileHandling/codekul.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File Is Created ");
            } else {
                System.out.println("File Exists");
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("IS FILE: "+file.isFile());
        System.out.println("PATH: "+file.getPath());
        System.out.println("FILE NAME: "+file.getName());
    }
}
