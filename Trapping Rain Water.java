class Solution {
    public int trap(int[] height) {
        int totalWater = 0;
        
        int i = 0;
        int j = height.length - 1;
        
        int leftMax = 0;
        int rightMax = 0;
                
        while(i <= j){
            leftMax = Math.max(leftMax, height[i]);
            rightMax = Math.max(rightMax, height[j]);
            
            if(leftMax <= rightMax){
                totalWater += leftMax - height[i];
                i++;}
            
            else if(leftMax >= rightMax) {
                 totalWater += rightMax - height[j];
                j--;}
        }
        
        return totalWater;
    }
}
