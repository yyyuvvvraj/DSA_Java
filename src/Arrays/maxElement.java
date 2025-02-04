package Arrays;

public class maxElement {
    public static void main(String[] args) {
        int[] arr={10,100,234,543,645,2312,234,5643};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
