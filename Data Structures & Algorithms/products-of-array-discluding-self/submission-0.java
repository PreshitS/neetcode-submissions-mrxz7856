class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];
        int[] ans = new int[nums.length];
        prefixProduct[0] = nums[0];
        suffixProduct[nums.length - 1] = nums[nums.length - 1];
        
        for(int i = 1; i < nums.length; i++){
            prefixProduct[i] = nums[i] * prefixProduct[i-1];
        }

        for(int i = nums.length - 2; i > 0; i--){
            suffixProduct[i] = nums[i] * suffixProduct[i+1];
        }

        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                ans[i] = suffixProduct[i + 1];
            }
            else{
                if(i == nums.length - 1){
                    ans[i] = prefixProduct[nums.length - 2];
                }
                else{
                    ans[i] = prefixProduct[i-1] * suffixProduct[i+1];
                }
            }
        }
        return ans;
    }
}  
