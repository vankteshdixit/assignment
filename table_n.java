package assignment;
import java.util.Scanner;
public class table_n {
        public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The value of n is="+n);
            for(int i=1;i<=(n*10);i++){
                if(i%n==0){
                    System.out.println(i);
                }
            }
        }
    }