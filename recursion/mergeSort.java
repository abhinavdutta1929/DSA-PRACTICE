package recursion;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
     int[] arr = {9,8,5,7,2,3,1};
     arr = m_sort(arr);
        System.out.println(Arrays.toString(m_sort(arr)));
    }
    public static int[] m_sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] first = m_sort(Arrays.copyOfRange(arr,0,mid));
        int[] second = m_sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(first , second);

    }
    private static int[] merge(int[] first , int[] second){
        int[] mix = new int[first.length+ second.length];

        int i = 0;
        int j= 0;
        int k = 0;

        while(i < first.length && j < second.length ){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;

        }
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}

