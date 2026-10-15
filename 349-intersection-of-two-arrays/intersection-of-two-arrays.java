class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> set=new HashSet<>();
       for(int n:nums1)
       {
        set.add(n);
       }
        HashSet<Integer> res=new HashSet<>();
        int i=0;
       for(int n:nums2)
       {
        if(set.contains(n))
        {
            res.add(n);
        }  
       }
       int [] ans=new int[res.size()];
       for(int n:res)    
       {
        ans[i]=n;
        i++;
       }
       return ans;
        
    }
}