package assignment;
import java.util.Scanner;
public class que_first {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        System.out.println("the value of n is="+n);
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            System.out.println("the sum is ="+sum);
        }
    }
}
