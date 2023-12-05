import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Instantiate objects
        TextFileReader tr = new TextFileReader("sample.txt");
        TextSerializer ts = new TextSerializer();

        try {
            // Step 1: Read content from the file
            String fullText = tr.readTextFile("sample.txt");

            // Optional: Print the content
            System.out.println("Content read from the file:\n" + fullText);

            // Use regex to split the content into parts
            String[] parts = fullText.split("Part \\d:");

            // Serialize the parts into 3 files
            for (int partNumber = 1; partNumber < parts.length; partNumber++) {
                String serializedFileName = "part" + partNumber + ".ser";
                ts.serializeText("Part " + partNumber + ": " + parts[partNumber], serializedFileName);
            }

            // Deserialize and print the content from the serialized files
            for (int partNumber = 1; partNumber < parts.length; partNumber++) {
                String serializedFileName = "part" + partNumber + ".ser";
                String part = ts.deserializeText(serializedFileName);
                System.out.println("Deserialized content from " + serializedFileName + ":\n" + part);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

