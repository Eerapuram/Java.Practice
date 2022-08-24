package filehandling;

import java.io.File;
import java.io.IOException;

public class Demo {
    public  static  void main(String args[]) throws IOException{
        String filepath =".idea/Files/Demofile";
        File file = new File(filepath);
        if(file.exists())
        {
            System.out.println("The file exists in the location: " +filepath);
        }
        else {
            System.out.println("The file does not exists in the location: " +filepath);
        }
    }
}
