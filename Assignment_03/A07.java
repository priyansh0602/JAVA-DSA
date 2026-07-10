package Assignment_03;
import java.util.Scanner;
public class A07 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int sum = 0;
    while(true){
        System.out.print("enter number(press 0 if you want to add them all): ");
        int n = in.nextInt();
        if(n==0){
           break;
        }
        sum = sum+n;
    }
    System.out.println(sum);
  }  
}
