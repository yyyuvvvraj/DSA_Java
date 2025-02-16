package arrays;

public class sumOfArray {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,43,23,45,56};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}
