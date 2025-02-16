package arrays;

import java.util.ArrayList;

public class basicsOfArrayList {
    public static void main(String[] args) {
//        int[] arr={1,2,3};
//        double[] arr={3.14,2.78,5.6};
        ArrayList<Integer> arr=new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr);
//        for (int i = 0; i <= 5; i++) {
//            System.out.print(arr.get(i)+" ");

        }

    }

