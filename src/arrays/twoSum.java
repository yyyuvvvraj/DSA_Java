package arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int x=9;
        int n=arr.length;
        //sol
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }
}
