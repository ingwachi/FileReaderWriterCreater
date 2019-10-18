import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("write.txt",false);
        BufferedWriter bw = new BufferedWriter(fileWriter);

        try{
            bw.append("Wachirawit Onchet");
            bw.newLine();
            bw.append("Ing");
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
