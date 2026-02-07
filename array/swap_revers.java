//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package array;

import java.util.Arrays;
import java.util.Scanner;

public class swap_revers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < arr.length; ++i) {
            System.out.println("Enter the array element" + (i + 1));
            arr[i] = in.nextInt();
        }

        revers(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void revers(int[] arr) {
        int start = 0;

        for(int end = arr.length - 1; start < end; --end) {
            swap(arr, start, end);
            ++start;
        }

    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
