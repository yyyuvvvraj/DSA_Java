package Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,7,78,21,34};
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=Math.max(max,arr[i]);
            }
        }
        int smax=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>smax){
                if(arr[i] != max){
                    smax=Math.max(smax,arr[i]);
                }
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
