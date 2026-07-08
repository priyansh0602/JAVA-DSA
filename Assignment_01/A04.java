package Assignment_01;
import java.util.Scanner;
public class A04{
      public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("num1: ");
        int a = in.nextInt();
        System.out.print("num2: ");
        int b= in.nextInt();
        int hcf = 1;
        for(int i = 1; i<=a && i<=b ; i++){
          if(a%i==0 && b%i==0){
            hcf = i;
          } 
        }
        int lcm;
          if(a>b){
            lcm = a;
          }else{
            lcm = b; 
          } 
          while(true){
            if(lcm%a==0 && lcm%b==0){
              break;
            }
            lcm++;
          }
          System.out.println(hcf);
          System.out.println(lcm);
          }
        
      }
