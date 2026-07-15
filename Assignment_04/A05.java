package Assignment_04;
import java.util.Scanner;
public class A05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = in.nextDouble();
        System.out.println(circumference(r));
        System.out.println(area(r));

    }
    static double circumference(double r){
          return 2*3.14*r;
    } 
    static double area(double r){
        return 3.14*r*r;
    }
    
}
