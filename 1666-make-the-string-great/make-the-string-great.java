class Solution {
    public String makeGood(String s) {
        char[] stack = new char[s.length()];
        int top=-1;
        for(int i=0;i<s.length();i++)
        {
            if(top>=0 && Math.abs(stack[top]-s.charAt(i))==32)
            {
                top--;
            }
            else
            {
                top++;
                stack[top]=s.charAt(i);
            }
        }
        return new String(stack,0,top+1);
    }
}