package Assignment_03;
import java.util.Scanner;
public class A19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int sum = 0;
        for(int i =1; i<=num-1; i++){
    if(num%i==0){
        sum = sum+i;
    }
        }    
        if(sum==num){
            System.out.print("perfect");
        } else{
            System.out.println("not perfect");
        }  
    }
}
