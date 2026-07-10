package Assignment_03;
import java.util.Scanner;
public class A03{
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("enter lenght to find area of triangle: ");
     float l = in.nextFloat();
     System.out.print("enter bredth to find area of triangle: ");
     float b = in.nextFloat();
     float AOR = l*b;
     System.out.println(AOR);
    }
}