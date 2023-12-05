import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader {
    //object class should implement serializable interface.
    private String fileName;

    public TextFileReader(String fileName)
    {
            this.fileName = fileName;
    }
    public String readTextFile(String fileName) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = br.readLine()) != null){
            sb.append(line).append("\n");
        }


            return sb.toString().trim();
    }
}
