package g;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class FunctionMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double number1, number2;

        System.out.println("Enter the first number: ");
        number1 = scanner.nextDouble();
        System.out.println("Enter the second number: ");
        number2 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Choose the desired operation (+, -, /, *): ");
        String operation = scanner.next().trim();

        switch (operation){
            case "+" -> System.out.println(sumValues(number1, number2));
            case "-" -> System.out.println(subtractValues(number1, number2));
            case "/" -> System.out.println(divideValues(number1, number2));
            case "*" -> System.out.println(multiplyValues(number1, number2));
            default -> System.out.println("Unidentified operation.");
        }
    }

    private static BigDecimal sumValues(Double number1, Double number2) {
        BigDecimal num1 = new BigDecimal(number1);
        BigDecimal num2 = new BigDecimal(number2);
        BigDecimal sumValues = num1.add(num2).setScale(2, RoundingMode.UP);
        return sumValues;
    }

    private static Double subtractValues(Double number1, Double number2) {
        Double subtractValues = number1 - number2;
        return subtractValues;
    }

    private static Double divideValues(Double number1, Double number2) {
        Double divideValues = number1 / number2;
        return divideValues;
    }

    private static Double multiplyValues(Double number1, Double number2) {
        Double multiplyValues = number1 * number2;
        return multiplyValues;
    }
}
