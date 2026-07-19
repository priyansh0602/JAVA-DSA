package Assignment_05;
import java.util.*;
public class good_pairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Length of array: ");
        int n = in.nextInt();
        int[]nums = new int[n];
        for(int i = 0; i<n; i++){
            System.out.print("valuse at idex" + i + " :");
            nums[i] = in.nextInt();
        }

        int ans = goodpair(nums);
        System.out.println(ans);

    }
    static int goodpair(int[] nums){
        int gp = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1 ; j<nums.length; j++){
            if (nums[i]==nums[j]) {
                gp = gp + 1;
            }
            }
        }
        return gp;
    }
}
