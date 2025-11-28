package Chapter_8;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        int[] arr = new int[5];

        display("Original array:", arr);

        Arrays.fill(arr, 8);
        display("After filling with 8s:", arr);

        arr[1] = 6;
        arr[3] = 3;
        display("After changing two values:", arr);

        Arrays.sort(arr);
        display("After sorting:", arr);
    }

    public static void display(String msg, int[] arr) {
        System.out.print(msg + " ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
