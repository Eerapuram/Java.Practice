package filehandling;

import java.io.File;
import java.io.IOException;

public class Createfile {
    public  static  void main(String args[]) throws IOException {
        String filepath =".idea/Files/Demofile1";
        File file = new File(filepath);
        if(file.createNewFile())
        {
            System.out.println("The file created: " +file.getName());
        }
        else {
            System.out.println("The file already exists.");
        }
    }
}
