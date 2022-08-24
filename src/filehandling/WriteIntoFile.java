package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteIntoFile {
    public static void main(String args[]) throws IOException {
        String filepath = ".idea/Files/Demofile1";
        FileWriter w = new FileWriter(filepath);
        w.write("1. The first statement\n");
        w.write("2. The second statement\n");
        w.write("3. The third statement\n");
        w.write("4. The fourth statement\n");
        w.write("5. The fifth statement");
        w.close();
    }
}
