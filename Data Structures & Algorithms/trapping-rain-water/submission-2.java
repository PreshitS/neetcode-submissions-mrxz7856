class Solution {
    public int trap(int[] height) {
        int[] maxFromLeft = new int[height.length];
        int[] maxFromRight = new int[height.length];
        int totalWater = 0;

        for(int i = 0; i < height.length; i++){
            if(i == 0) maxFromLeft[i] = height[i];
            else{
                maxFromLeft[i] = Math.max(height[i], maxFromLeft[i-1]);
            }
        }

        for(int i = height.length - 1; i > -1; i--){
            if(i == height.length - 1) maxFromRight[i] = height[i];
            else{
                maxFromRight[i] = Math.max(height[i], maxFromRight[i+1]);
            }
        }

        for(int i = 1; i < height.length - 1; i++){
            if(maxFromLeft[i] > height[i] && maxFromRight[i] > height[i]){
                totalWater = totalWater + (Math.min(maxFromLeft[i], maxFromRight[i]) - height[i]);
            }
        }
        
        return totalWater;
    }
}
