package d;

public class Recursion {
    public static void main(String[] args) {
        repeat(0, 10);
    }

    public static void repeat(int repeatNumber, int finalNumber) {
        if (repeatNumber<=finalNumber) {
            System.out.println(repeatNumber);
            repeat(++repeatNumber, finalNumber);
        }
    }
}
