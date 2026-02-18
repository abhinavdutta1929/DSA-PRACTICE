package recursion;

public class BS {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,9};
        int target = 8;
        int s = 0;
        int e = arr.length-1;
        int ans = search(arr, target,s,e);
        System.out.println(ans);

    }
    public static int search(int[] arr, int target , int s , int e){
        if(s > e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]<target){
            return search(arr,target,mid+1,e);
        }
        else {
            return search(arr,target,s,e-1);
        }
    }
}
