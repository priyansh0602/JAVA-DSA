package Assignment_01;
import java.util.Scanner;
public class sum_of_two{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("num1: ");
        int a = in.nextInt();
        System.out.print("num2: ");
        int b = in.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
