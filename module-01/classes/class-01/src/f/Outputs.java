package f;

public class Outputs {
    public static void main(String[] args) {
        System.out.print("Welcome\t");
        System.out.print("Arthur");

        System.out.println("Welcome");
        System.out.println("Arthur");

        String name = "Arthur";
        Integer age = 12;
        Double LuckyNumber = 25.1232;

        //Locale.setDefault(Locale.US) - since printf formats the number to your local machine's default, you can change the formatting using Locale (. instead of ,) ;
        System.out.printf("Welcome %s, your age is %d and your lucky number is %.2f", name, age, LuckyNumber);
    }
}
