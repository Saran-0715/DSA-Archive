class Solution {
    public boolean areOccurrencesEqual(String s) {
        int [] c=new int[128];
        for(int i=0;i<s.length();i++)
        {
            c[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(c[s.charAt(0)]!=c[s.charAt(i)])
            {
                return false;
            }
        }
        return true;
    }
}