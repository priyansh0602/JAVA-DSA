package Assignment_03;
import java.util.Scanner;
public class power_of_number {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("enter the number to find power of: ");
    int num = in.nextInt();
    System.out.print("enter power: ");
    int pow = in.nextInt();
    int result =1;
    for(int i = 1; i<=pow; i++){
        result = result*num;
    }
    System.out.println(result); 
   } 
}

