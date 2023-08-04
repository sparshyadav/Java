public class Swap_Integers {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        System.out.println("Before Swapping: i = " + i + " j = " + j);
        swap(i, j);

    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping: a = " + a + " b = " + b);
    }
}
