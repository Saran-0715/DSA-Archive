class Solution {
    public String reverseOnlyLetters(String s) {
        char[] a = s.toCharArray();
        int r=0;
        int l=a.length-1;

        while(r<l)
        {
            if(!Character.isLetter(a[r]))
            {
                r++;
            }
            else if(!Character.isLetter(a[l]))
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