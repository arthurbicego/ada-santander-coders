package e;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HandlingMenu {

    static Scanner scanner = new Scanner(System.in);
    static List<String> listContacts = new ArrayList<>();
    static Path path = Paths.get("C:\\Users\\arthu\\OneDrive\\Documentos\\4. Workspace\\Santander Coders\\Web Full Stack\\@unit.01\\class06\\file.txt");


    public static void main(String[] args) throws IOException {

        boolean keep = true;

        while (keep) {
            System.out.println("Choose one option:\n" +
                    "1 - Create a contact.\n" +
                    "2 - Read contacts.\n" +
                    "3 - Exit menu.");
            String input = scanner.nextLine();
            switch (input) {
                case "1" -> createContact();
                case "2" -> readContacts();
                case "3" -> keep = false;
                default -> System.out.println("Invalid option.");
            }
        }

    }

    private static void createContact() throws IOException {
        System.out.println("Type the name of the Contact:");
        String contactName = scanner.nextLine();
        System.out.println("Type the phone number of the Contact.");
        String contactNumber = scanner.nextLine();
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        Files.writeString(path, contactName + "&" + contactNumber + "\n", StandardCharsets.UTF_8, StandardOpenOption.APPEND);
    }

    private static void readContacts() throws IOException {
        listContacts = Files.readAllLines(path, StandardCharsets.UTF_8);
        String name, phone;
        for (String string : listContacts) {
            name = string.split("&")[0];
            phone = string.split("&")[1];
            System.out.println("Name: " + name);
            System.out.println("Phone Number: " + phone);
        }
    }
}
