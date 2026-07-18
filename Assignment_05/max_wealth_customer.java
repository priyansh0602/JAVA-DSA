package Assignment_05;
import java.util.Scanner;
public class max_wealth_customer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.print("Enter no. of customers: ");
        int m = in.nextInt();
        System.out.print("Enter no. of bank accoutns per customer: ");
        int n = in.nextInt();
        int [][] account = new int[m][n];
        for(int i = 0; i<account.length; i++){
            System.out.println(" customer"+ i);
            for(int j = 0; j<account[i].length; j++){
                System.out.print("Balance in " + j + " account: ");
            account[i][j] = in.nextInt();
            }
        }
        int ans = richestWealth(account);
            System.out.print(ans);
    }
    static int richestWealth(int[][] accounts){
        int max = 0;
        for(int i = 0; i<accounts.length; i++){
            int total = 0;
            for(int j = 0; j<accounts[i].length; j++){
             total = total + accounts[i][j];
            }
             if(total>max){
                max = total;
             } 
        
        }
        return max;
    
    }
}

