class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> ans=new ArrayList<>();
        int max=0;
        for(int n:candies)
        {
            max=Math.max(n,max);
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
            {
                ans.add(true);
            }
            else
            {
                ans.add(false);
            }
        }
        return ans;
    }
}