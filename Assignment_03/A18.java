package Assignment_03;
import java.util.Scanner;
public class A18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a string: ");
        String str = in.nextLine();
        int vowel = 0;
        int consonent = 0;
        for(int i = 0; i<=str.length()-1; i++){
        char check = str.charAt(i);
        if(check == 'a' || check == 'e' || check == 'i' || check == 'o' || check== 'u' ){
       vowel++;
        }else{
            consonent++;
        }
        }
        System.out.println(vowel);
        System.out.println(consonent);
        }
}
