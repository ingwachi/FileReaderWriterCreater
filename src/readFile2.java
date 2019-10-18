import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readFile2 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader("newFile2withSep.txt");
            BufferedReader br = new BufferedReader(fileReader);
            String line;
            while ((line = br.readLine()) != null){
                String[] arr = line.split(",");
                System.out.println(arr[1] + "   /    " + arr[0]);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
