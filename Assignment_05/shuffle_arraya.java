package Assignment_05;
import java.util.Scanner;
import java.util.Arrays;
public class shuffle_arraya {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number to print array of double its size and later sort them: ");
        int n = in.nextInt();

        int [] nums = new int[2*n];
        for(int i = 0; i<nums.length; i++){
            System.out.print("Value at " + i + " index: ");
            nums[i] = in.nextInt();
        }
        int[] ans = shuffel(nums);
        System.out.println(Arrays.toString(ans));

    }  
    static int[] shuffel(int[] nums){
       int[] shuffled = new int[nums.length];
       for(int i = 0; i<nums.length/2; i++){
       shuffled[2*i] = nums[i];
       shuffled[2*i+1] = nums[i+nums.length/2];
       }
       return shuffled;
        
      }
 }
