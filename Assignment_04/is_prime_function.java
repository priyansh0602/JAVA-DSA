package Assignment_04;
import java.util.Scanner;
public class is_prime_function {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        boolean is = isprime(num);
       if(is){
    System.out.println("prime");
       }else{
        System.out.println("not prime");
       }
    }
    static boolean isprime(int num){
         if(num<2){
                return false;
            }
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
      
    }
}

