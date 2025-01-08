package c;

import java.io.*;

public class HandlingPrintWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\arthu\\OneDrive\\Documentos\\4. Workspace\\Santander Coders\\Web Full Stack\\@unit.01\\class06\\file.txt");
        PrintWriter writer = new PrintWriter(new FileOutputStream(file, true));
        writer.println("PrintWriter Test - 1");
        writer.println("PrintWriter Test - 2");
        writer.println("PrintWriter Test - 3");
        writer.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while (bufferedReader.ready()) {
        String line = bufferedReader.readLine();
        System.out.println("Line 1: " + line);
        }
        bufferedReader.close();

    }
}
