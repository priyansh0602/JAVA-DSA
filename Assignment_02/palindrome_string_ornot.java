package Assignment_02;
import java.util.Scanner;
public class palindrome_string_ornot{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = in.nextLine();
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
        rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("not");
        }
    }
}