package filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String args[]) throws IOException {
        String filepath = ".idea/Files/Demofile1";
        File file = new File(filepath);
        Scanner s = new Scanner(file);
        while (s.hasNext()) {
            String data = s.nextLine();
            System.out.println(data);
        }
        s.close();
    }
}
