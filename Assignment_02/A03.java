package Assignment_02;
import java.util.Scanner;
public class A03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("p: ");
        float p = in.nextInt();
        System.out.print("r: ");
        float r = in.nextInt();
        System.out.print("t: ");
        float t = in.nextInt();
        float SI = (p*r*t)/100;
        System.out.println(SI);
    }
}
