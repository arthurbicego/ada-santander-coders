package e;

public class ArrayRecursion {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        repeat(list, 4);
    }

    public static void repeat(int[] list, int startPosition) {
        if (list.length>startPosition) {
            System.out.println(list[startPosition]);
            startPosition++;
            repeat(list, startPosition);
        }
    }
}
