class Solution {
    public int characterReplacement(String s, int k) {
     int i=0;
     int j=0;
     int maxLen=0;
     int maxFreq=0;
     int[] freq=new int[26];
    
    while(j<s.length()){
        char ch=s.charAt(j);
        freq[ch-'A']++;
        maxFreq=Math.max(maxFreq,freq[ch-'A']);

        while((j-i+1)-maxFreq>k){
            char left = s.charAt(i);
                 freq[left-'A']--;
                i++;
        }

        maxLen=Math.max(maxLen,j-i+1);
        j++;
    }




        return maxLen;
    }
}
