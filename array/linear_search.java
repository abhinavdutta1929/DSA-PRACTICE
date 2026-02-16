//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package array;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = new int[]{23, 34, 45, 13, 57, 90};
        int target = 45;
        int ans = search(arr, target);
        System.out.println("The target was found at the index number : " + ans);
    }

    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        } else {
            for(int i = 0; i < arr.length; ++i) {
                int element = arr[i];
                if (element == target) {
                    return i;
                }
            }

            return -1;
        }
    }
}

