package d;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class HandlingPath {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\arthu\\OneDrive\\Documentos\\4. Workspace\\Santander Coders\\Web Full Stack\\@unit.01\\class06\\file.txt");
        Files.writeString(path, "Lorem ipsum dolor sit amet consectetur adipiscing. \n", StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        List<String> list = Files.readAllLines(path, StandardCharsets.UTF_8);
        String listString = String
                .join("\n", list.toString()
                .substring(1, list.toString().length()-1)
                .split(","));
        Files.writeString(path, listString);
        System.out.println(list + "\n \n");
        System.out.println(listString);
    }
}
