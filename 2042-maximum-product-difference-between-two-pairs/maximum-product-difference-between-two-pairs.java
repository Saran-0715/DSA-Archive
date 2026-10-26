class Solution {
    public int maxProductDifference(int[] nums) {
        int max1=0;
        int max2=0;
        int min1=10001;
        int min2=-10001;
        for(int n:nums)
        {
            if(n>max1)
            {
                max2=max1;
                max1=n;
            }
            else if(n>max2)
            {
                max2=n;
            }
            if(n<min1)
            {
                min2=min1;
                min1=n;
            }
            else if(n<min2)
            {
                min2=n;
            }
            
        }
        return (max1*max2)-(min1*min2);
    }
}