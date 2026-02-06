class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> ans=new ArrayList<>();
        if(p.length() >s.length()) return ans;

        int[] pfreq=new int[26];
        int[] windfreq=new int[26];

        for(int i=0;i<p.length();i++)
        {
            pfreq[p.charAt(i)-'a']++;
        }
        int left=0;
        
        for(int right=0;right<s.length();right++)
        {
             windfreq[s.charAt(right)-'a']++;
        
        if(right-left+1 == p.length())
        {
            if(isSame(pfreq,windfreq))
            {
                ans.add(left);
            }
            windfreq[s.charAt(left)-'a']--;
            left++;
          }
        } 
            
        return ans;
    }
    private boolean isSame(int[] a,int [] b)
    {
        for(int i=0;i<26;i++)
        {
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
}