class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        for(int j=0;j<k;j++)
        {
            int a = Integer.MAX_VALUE;
            int b = 0;
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]<a)
                {
                    a = nums[i];
                    b = i;
                }
            }
            nums[b] = a * multiplier;
        }
        return nums;
    }
}
