class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
           if(nums.length==0){
            return 0;
        }
        int count=1;
        int max=1;
     
        int first=nums[0];
     
       for(int i=1;i<nums.length;i++){
        if(nums[i]==first){
            continue;
        } if(nums[i]==first+1){
            count++;
        } else{
            count=1;
        }
             max=Math.max(max,count);
             first=nums[i];;
       }

       return max;
    }
}
