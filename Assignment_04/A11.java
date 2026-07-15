package Assignment_04;
import java.util.Scanner;
public class A11{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter: ");
        int start = in.nextInt();
        System.out.print("End: ");
        int end = in.nextInt();
        isprime(start, end);
    }
    static void isprime(int start, int end){
        for(int i = start; i<=end; i++){
            if(i<2){
                continue;
            }
            boolean prime = true;
            for(int j = 2; j<i; j++){
              if(i%j==0){
               prime = false;
               break;
              }
                
            } 
            if(prime){
                System.out.println(i);
            }
        }
    }
}