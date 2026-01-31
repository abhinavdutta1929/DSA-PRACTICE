package array;

public class celling {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5, 6, 7, 12, 14, 16, 34, 67, 89};
        int target = 90;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        } else {
            int start = 0;
            int end = arr.length - 1;

            while(start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    if (target <= arr[mid]) {
                        return mid;
                    }

                    ++start;
                }
            }

            return start;
        }
    }
}
