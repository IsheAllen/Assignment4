import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("dataset (1).txt"));
        StringBuilder contents = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            contents.append(line);
            contents.append(System.lineSeparator());
        }
        reader.close();
        String fileContents = contents.toString();
        MyClass myClass = new MyClass(fileContents);
        // call methods in MyClass that use the fileContents variable
    }
}

class MyClass {
    private String fileContents;

    public MyClass(String fileContents) {
        this.fileContents = fileContents;
    }

    // define methods that use the fileContents variable
}