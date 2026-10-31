class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String x=s+s;
        x=x.substring(1,x.length()-1);
        return x.contains(s);
    }
}