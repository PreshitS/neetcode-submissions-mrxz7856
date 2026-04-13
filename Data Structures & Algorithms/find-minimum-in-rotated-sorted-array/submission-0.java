class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(n == 1 || nums[0] < nums[n - 1]){
            return nums[0];
        }

        int left = 1;
        int right = n - 1;
        while(left <= right && right < n){
            int mid = (left + right) / 2;
            if(nums[mid] < nums[mid - 1]){
                return nums[mid];
            }
            else if(nums[mid] > nums[0]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return -1;
    }
}
