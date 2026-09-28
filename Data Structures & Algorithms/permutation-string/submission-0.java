class Solution {
    public boolean checkInclusion(String s1, String s2) {
       char[] s=s1.toCharArray();
       Arrays.sort(s);

       int i=0;
       int j=0;
       int windowLen=s.length;
       while(j<s2.length()){
          if(j-i+1==windowLen){
            char[] window=s2.substring(i,j+1).toCharArray();
            Arrays.sort(window);
            if(Arrays.equals(s,window)){
                return true;
            }
            i++;
          }
          j++;
       }

       return false;
    }
}
