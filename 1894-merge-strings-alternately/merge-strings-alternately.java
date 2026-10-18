class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        String a="";
        while(i<word1.length()||i<word2.length())
        {
            if(i<word1.length())
            {
                a=a+word1.charAt(i);
            }
            if(i<word2.length())
            {
                a=a+word2.charAt(i);
            }
            i++;
        }
        return a;
    }
}