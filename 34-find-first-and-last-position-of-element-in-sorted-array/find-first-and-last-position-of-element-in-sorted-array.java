class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=-1;
        int l=0;
        int h=nums.length-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(nums[mid]==target)
            {
                f=mid;
                h=mid-1;
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        int ls=-1;
        l=0;
        h=nums.length-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(nums[mid]==target)
            {
                ls=mid;
                l=mid+1;
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        return new int[]{f,ls};
    }
}