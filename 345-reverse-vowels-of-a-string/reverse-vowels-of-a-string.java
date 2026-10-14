class Solution {
    public String reverseVowels(String s) {
       char[] a=s.toCharArray();
       int r=0;
       int l=a.length-1;
       while(r<l)
       {
        if("AEIOUaeiou".indexOf(a[r])==-1)
        {
            r++;
        }
        else if("AEIOUaeiou".indexOf(a[l])==-1)
        {
            l--;
        }
        else
        {
            char temp=a[r];
            a[r]=a[l];
            a[l]=temp;

            r++;
            l--;
        }
       }
       return new String(a);
    }
}