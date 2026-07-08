package Assignment_02;
import java.util.Scanner;
public class A06{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("currency to convert in USD: ");
        int c = in.nextInt();
        int USD = c*95;
    System.out.println(USD);
    }
}