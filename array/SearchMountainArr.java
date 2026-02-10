//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package array2;

public class SearchMountainArr {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 3, 2, 1, 0};
        int target = 3;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int check = AgnosticSearch(arr, target, 0, peak);
        return check != -1 ? check : AgnosticSearch(arr, target, peak + 1, arr.length - 1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int AgnosticSearch(int[] arr, int target, int start, int end) {
        boolean IsAse = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (IsAse) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
