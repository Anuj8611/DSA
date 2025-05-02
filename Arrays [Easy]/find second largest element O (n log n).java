//find second largest element
import java.util.Arrays;

class Solution {
    public int secondLargestElement(int[] nums) {
        int secondlarge = Integer.MIN_VALUE;
        if (nums == null || nums.length < 2) {
            return -1;
        }

        
        Arrays.sort(nums);

        
        int largest = nums[nums.length - 1];
         for (int i = nums.length - 2; i >= 0; i--) 
         {
           
            if (nums[i] != largest) {
                
                secondlarge = nums[i];
                break;  
            }
        }
        return secondlarge == Integer.MIN_VALUE ? -1 : secondlarge;
    }
}
