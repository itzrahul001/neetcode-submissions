class Solution {
    public int maxArea(int[] heights) {
        int maxWater=0;
        int i=0;
        int j=heights.length-1;
        while(i<j){
            int height=Math.min(heights[i],heights[j]);
            int bredth=j-i;
            int water=height*bredth;
            maxWater=Math.max(maxWater,water);
            if(heights[i]<heights[j]){
                i++;
            } else if(heights[i]>heights[j]){
                j--;
            } else{
                i++;
                j--;
            }
        }
        return maxWater;
    }
}
