package PatternPrinitng.PatternPrinting_SpecialPatterns;
import java.util.Scanner;
public class OddNos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:- ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(2*j-1 + " ");
            }
            System.out.println();
        }
    }
}
