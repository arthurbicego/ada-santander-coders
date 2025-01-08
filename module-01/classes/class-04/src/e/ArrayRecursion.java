package e;

public class ArrayRecursion {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        repeat(list, 0);
    }

    public static void repeat(int[] list, int numberRepeat) {
        if (list.length>numberRepeat) {
            System.out.println(list[numberRepeat]);
            numberRepeat++;
            repeat(list, numberRepeat);
        }
    }
}
