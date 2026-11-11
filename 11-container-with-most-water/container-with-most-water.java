class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int max=0;
        while(l<r)
        {
           int diff= r-l;
           int min=Math.min(height[l],height[r]);
           int p=diff*min;
           max=Math.max(p,max); 

           if(height[l]<height[r])
           {
            l++;
           }
           else
           {
            r--;
           }
        }
        return max;
    }
}