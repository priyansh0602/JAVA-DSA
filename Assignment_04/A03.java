package Assignment_04;
import java.util.Scanner;
public class A03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        boolean iseligible = ornot(age);
        if(iseligible){
            System.out.println("Eligible");
        }else{
            System.out.println("not eligible");
        }

    }
    static boolean ornot(int age){
        if(age>=18){
            return true;
        }else{
            return false;
        }
    }
}
