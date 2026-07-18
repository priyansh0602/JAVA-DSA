package Assignment_05;
import java.util.Scanner;
public class running_sum_of_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int a = in.nextInt();
        int [] nums = new int[a];
        for(int i = 0; i<nums.length; i++){
            System.out.print("value at " + i + " index: ");
            nums[i] = in.nextInt();
        }
        int[] ans = runtimesum(nums);
        for(int i = 0; i<nums.length; i++){
            System.out.print(ans[i] + " ");
            }
            System.out.println();

    }
    static int[] runtimesum(int[] nums){
        int [] ans = new int [nums.length];
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum = sum + nums[i];
          ans[i] = sum;
        }
        return ans;
    }
}

