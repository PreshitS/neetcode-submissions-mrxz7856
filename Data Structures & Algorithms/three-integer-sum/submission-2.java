class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int start = i + 1;
            int end = nums.length - 1;
            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(sum == 0){
                    List<Integer> tempArray = new ArrayList<>();
                    tempArray.add(nums[i]);
                    tempArray.add(nums[start]);
                    tempArray.add(nums[end]);
                    res.add(tempArray);
                    start++;
                    end--;
                    while(start < end && nums[start] == nums[start - 1]){
                        start++;
                    }
                }
                else if(sum > 0){
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        return res;
    }
}
