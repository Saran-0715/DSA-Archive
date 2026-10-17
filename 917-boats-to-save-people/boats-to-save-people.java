class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int b=0;
        int l=0;
        int r=people.length-1;
        while(l<=r)
        {
            int sum=people[l]+people[r];
            if(sum<=limit)
            {
                b++;
                l++;
                r--;
            }
            else
            {
                r--;
                b++;
            } 
        }
        return b;
    }
}