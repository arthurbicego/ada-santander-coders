package a;

import java.io.File;
import java.io.IOException;

public class HandlingExceptions {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\arthu\\OneDrive\\Documentos\\4. Workspace\\Santander Coders\\Web Full Stack\\@unit.01\\class06\\file.txt");
            file.createNewFile();

//            if you want to create your own Exception, you need to throw that like:
//            throw new NullPointerException();
        } catch (IOException exception) {
            System.out.println("IOException");
        } catch (NullPointerException exception) {
            System.out.println("NullPointerException");
        } finally {
            System.out.println("Finally");
        }
    }
}
