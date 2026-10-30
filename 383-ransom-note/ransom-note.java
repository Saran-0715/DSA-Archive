class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] c= new int[128];
        for(int i=0;i<magazine.length();i++)
        {
            c[magazine.charAt(i)]++;
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            c[ransomNote.charAt(i)]--;
            if(c[ransomNote.charAt(i)]<0)
            {
                return false;

            }
           
        }
        return true;

    }
}
        

    

