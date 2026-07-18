package Assignment_03;
import java.util.Scanner;
public class area_of_rectangle{
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("enter lenght to find area of rectangle: ");
     float l = in.nextFloat();
     System.out.print("enter bredth to find area of rectnagle: ");
     float b = in.nextFloat();
     float AOR = l*b;
     System.out.println(AOR);
    }
}