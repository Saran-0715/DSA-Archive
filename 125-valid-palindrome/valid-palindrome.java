class Solution {
    public boolean isPalindrome(String s) {
        int r=0;
        int l=s.length()-1;
        int f=0;
        while(r<l)
        {
            if(!Character.isLetterOrDigit(s.charAt(r)))
            {
                r++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(l)))
            {
                l--;
            }
            else
            {
                if(Character.toLowerCase(s.charAt(r))!=Character.toLowerCase(s.charAt(l)))
                {
                    f=1;
                    break;
                }
                r++;
                l--;
            }
        }
        if(f==1)
        {
            return false;
        }
        else
        {
            return true;
        }

        
    }
}