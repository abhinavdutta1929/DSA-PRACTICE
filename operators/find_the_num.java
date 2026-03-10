package operators;

public class find_the_num {
    public static void main(String[] args) {
        int[] arr = {4,4,4,2,6,6,6,7,7,7,3,3,3};
        int n = 3;
        System.out.println(findUnique(arr,n));
    }
    public static int findUnique(int[] arr, int n  ){
        int result = 0;
        for (int i = 0; i < 32 ; i++) {
            int bitsum = 0;
            for(int num : arr ){
                if(((num >> i)& 1)==1){
                    bitsum++;
                }
            }
            if(bitsum % n!= 0){
                result = result |(1<<i);
            }
        }
        return result;

    }
}
