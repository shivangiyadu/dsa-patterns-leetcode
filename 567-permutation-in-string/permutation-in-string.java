class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()>s2.length()) return false;
        
        int[] s1Fre=new int[26];
        int[] s2Fre=new int[26];

        for(int i=0;i<s1.length();i++)
        {
            s1Fre[s1.charAt(i)-'a']++;
        }
        int left=0;
        for(int right=0;right<s2.length();right++)
        {
            s2Fre[s2.charAt(right)-'a']++;

            if(right-left+1==s1.length())
            {
                  if(isSame(s1Fre,s2Fre))
                  {
                    return true;
                  }
                  s2Fre[s2.charAt(left)-'a']--;
                  left++;
            }
        }
        return false;
    }  
    private Boolean isSame(int[] a,int[] b)
    {
        for(int i=0;i<26;i++)
        {
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}