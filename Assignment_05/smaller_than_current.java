package Assignment_05;
import java.util.*;
public class smaller_than_current{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Length of array: ");
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i =0; i<n; i++){
        System.out.print("value at " + i + " : ");
        nums[i] = in.nextInt();
        }
        int[] sol =solution(nums);
      System.out.print(Arrays.toString(sol));
    }
    static int[] solution(int[] nums){
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            int small = 0;
              for(int j = 0; j<nums.length; j++){
                if(nums[j]<nums[i]){
                    small = small+1;
                }
              }
              ans[i] = small; 

        }
        return ans;
    }
}
