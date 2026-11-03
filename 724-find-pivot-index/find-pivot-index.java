class Solution {
    public int pivotIndex(int[] nums) {
        int t=0;
        for(int i=0;i<nums.length;i++)
        {
            t=t+nums[i];
        }
        int l=0;
        for(int i=0;i<nums.length;i++)
        {
            int r=t-l-nums[i];
            if(l==r)
            {
                return i;
            }
            l=l+nums[i];
        }
        return -1;
    }
}