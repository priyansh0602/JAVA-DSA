package Assignment_02;
import java.util.Scanner;
public class A05 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("num1: ");
      int num1 = in.nextInt();
      System.out.print("num2: ");
      int num2 = in.nextInt();
      int max = num1;
      if(num2>num1){
        max = num2;
      }
    System.out.println(max+ " is greatest");
    }
}
