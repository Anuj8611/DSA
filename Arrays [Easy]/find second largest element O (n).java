//find second largest element
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Solution {
    public int secondLargestElement(int[] nums) {
        int largest=Integer.MIN_VALUE;
        int secondlargest = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>largest)
            {
                secondlargest=largest;
                largest=nums[i];
            }
            
            else if (nums[i] > secondlargest && nums[i] != largest) {
                secondlargest = nums[i];
            }
        }
        return secondlargest;
    }
    
}
