package Assignment_03;
import java.util.Scanner;
public class A08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int max = 0;
    while(true){
        System.out.print("enter number to get highest(0 to execute): ");
        int n = in.nextInt();
    if(n == 0){
        break;
    }
    if (n>max){
        max = n;
    }
    }
    System.out.println(max);
    }
}
