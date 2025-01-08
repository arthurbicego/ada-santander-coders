package b;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HandlingFiles {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\arthu\\OneDrive\\Documentos\\4. Workspace\\Santander Coders\\Web Full Stack\\@unit.01\\class06\\file.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write("First write on file.");
        writer.close();
    }
}
