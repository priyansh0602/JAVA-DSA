package Assignment_04;
import java.util.Scanner;
public class A10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("H: ");
        int h = in.nextInt();
        System.out.print("p: ");
        int p = in.nextInt();
        System.out.print("b: ");
        int b = in.nextInt();
        boolean ans = pyth(h, p, b);
        if(ans){
            System.out.println("Pythogorous");
        }else{
            System.out.println("not pythogorous");
        }
    }
    static boolean pyth(int h, int p, int b){
        if(h*h==(p*p)+(b*b)){
    return true;
        }else{
            return false;
        }
    }
}
