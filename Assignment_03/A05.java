package Assignment_03;
import java.util.Scanner;
public class A05 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a num: ");
    int n = in.nextInt();
    int product = 1;
    int sum = 0;
    while(n>0){
     int rem = n%10;
     sum = sum+rem;
     product = product*rem;   
     n = n/10;
    }
    System.out.print(product - sum);
    }
}
