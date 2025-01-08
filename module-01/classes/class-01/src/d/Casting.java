package d;

public class Casting {
    public static void main(String[] args) {
        short firstNumber = 123;
        int m = 1000;
        firstNumber = (short) m;
        System.out.println(firstNumber);

        // Casting is recommended only adapting a high hierarchy to its child.
        // i.e: Object num1 = 10.0;
        // Double num2 = (Double) num1;

        //Casting primitive numbers:
        double num3 = 121.33;
        var num4 = 123;
        num4 = (int) num3;

        //Casting Wrap numbers
        Double num6 = 121.33;
        var num7 = 123;
        num7 = num6.intValue();
        String num8 = "121.33";
        num7 = Integer.parseInt(num8);

        //Casting from Double to String
        String.valueOf(num6);
        num6.toString();

    }
}
