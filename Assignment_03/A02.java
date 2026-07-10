package Assignment_03;
import java.util.Scanner;
public class A02{
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Enter base to find area of circle: ");
     float b = in.nextFloat();
     System.out.print("Enter height to find area of circle: ");
     float h = in.nextFloat();
     float AOT = (1f/2f)*b*h;
    System.out.print(AOT);
    }
}