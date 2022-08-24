package filehandling;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
    public  static  void main(String args[]) throws IOException {
        String filepath =".idea/Files/Demofile2";
        File file = new File(filepath);
        file.delete();
        if(file.exists())
        {
            System.out.println("The file is not deleted: " +file.getName());
        }
        else {
            System.out.println("The file is deleted.");
        }
    }
}
