package f;

public class FunctionMethods {
    public static void main(String[] args) {

        //No static
        FunctionMethods sum = new FunctionMethods();
        String result1 = sum.sumValues1(2.0,3.0);
        System.out.println(result1);

        //With static in the same class in both methods
        String result2 = sumValues2(3.0,4.0);
        //No static in the method that calls the other:
//        String result2 = FunctionMethods.sumValues2(3.0,4.0);
        System.out.println(result2);
    }

    // No static
    public String sumValues1(Double number1, Double number2) {
        Double sum = number1 + number2;
        return sum.toString();
    }

    // With static
    public static String sumValues2(Double number1, Double number2) {
        Double sum = number1 + number2;
        return sum.toString();
    }
}
