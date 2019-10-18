import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) {

        String separator = System.getProperty("file.separator");
        String Path = "C:"+separator+"Users"+separator+"WachirawitONCHET"+separator+"Desktop"+separator+"newFile.txt";
        try {
            File file = new File("newFile.txt");
            if (file.createNewFile()){
                System.out.println("File is created.");
            }
            else
                System.out.println("File is already exists.");
            File file4 = new File(".\\test\\newFile.txt");
            file4.createNewFile();
//               File file2 = new File(Path);
//               file2.createNewFile();
//               File file3 = new File("C:\\Users\\WachirawitONCHET\\Desktop\\newFile2.txt");
//               file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
