package c;

public class ObjectVar {
    public static void main(String[] args) {

        Object number1 = 10.0;
        Object number2 = "10.0";

        System.out.println(number1.equals(number2));
        System.out.println(number1.getClass().getName());
        System.out.println(number1 instanceof Double);
    }
}
