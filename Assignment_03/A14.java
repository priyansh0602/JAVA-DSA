package Assignment_03;
import java.util.Scanner;
public class A14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
        rev = rev+ str.charAt(i);
        }
        System.out.println(rev);
    }
}
