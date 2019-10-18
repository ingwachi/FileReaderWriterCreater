import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("newFile.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
