import java.io.*;

public class TextSerializer {
    public void serializeText(String text, String fileName) throws IOException{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName)){
            oos.writeObject(text);
        }

    }
    public String deserializeText(String fileName) throws IOException, ClassNotFoundException{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName)){
            ois.readObject();
            ret

        }

    }

}
