package e;

import java.util.Scanner;

public class TernaryOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your age category: ");
        String ageCategory = scanner.nextLine();

        Integer number = ageCategory.equals("child") ? 1 : 2;
        System.out.println(number);

    }
}
