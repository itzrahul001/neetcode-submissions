class Solution {
    public int findMin(int[] nums) {
       int min=Integer.MAX_VALUE;
        int prev=nums[0];
       for(int i=0;i<nums.length;i++){
          if(nums[i]<prev){
            return nums[i];
          }
       }
       return prev;
    }
}
