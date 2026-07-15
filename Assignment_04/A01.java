package Assignment_04;
import java.util.Scanner;
public class A01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = in.nextInt();
        System.out.print("num2: ");
        int num2 = in.nextInt();
        System.out.print("num3: ");
        int num3 = in.nextInt();
        System.out.println("largest= " +larg(num1, num2, num3));
        System.out.println("smallest= " +small(num1, num2, num3));
        
    }
    

 static int larg(int num1, int num2, int num3){
    int max = num1;
    if(num2>max){
        max=num2;
    }
    if(num3>max){
        max=num3;
    }
    return max;

}
static int small(int num1, int num2, int num3){
    int min = num1;
    if(num2<min){
        min = num2;
    }
    if(num3<min){
        min = num3;
    }
    return min;
}
}

