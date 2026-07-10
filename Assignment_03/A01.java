package Assignment_03;
import java.util.Scanner;
public class A01{
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Enter radius to find area of circle: ");
     float r = in.nextFloat();
     float Aoc = (22f/7f)*r*r;
     System.out.println(Aoc);
    }
}