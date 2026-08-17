class Solution {
    public boolean isAnagram(String s, String t) {
        
          if (s.length() != t.length()) {
            return false;
        }
        int[]frequency = new int [26];

        for(char a: s.toCharArray())
        {
            frequency[a-'a']++;
        }

          for(char a: t.toCharArray())
        {
            frequency[a-'a']--;
        }

        for(int i = 0 ; i < 26; i ++)
        {
            if(frequency[i]!=0)
            {
                return false;
            }
        }

        return true;

    }
}
