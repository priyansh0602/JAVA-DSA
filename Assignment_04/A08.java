package Assignment_04;
import java.util.Scanner;
public class A08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int ans = fac(num);
        System.out.println(ans);
    }
    static int fac(int num){
        int facto = 1;
      for(int i = 1; i<=num; i++){
       facto = facto*i;
       
      }
     return facto ;
    }
}
