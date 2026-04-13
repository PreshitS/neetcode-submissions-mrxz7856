class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> bucket = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            bucket.add(new ArrayList<>());
        }
        int[] ans = new int[k];

        for(int i = 0; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        map.forEach((key, value) -> bucket.get(value - 1).add(key));

        int posi = 0;
        for(int i = bucket.size() - 1; i >= 0; i--){
            if(k == 0){
                break;
            }
            if(bucket.get(i).size() > 0){
                for(int j = 0; j < bucket.get(i).size(); j++){
                    ans[posi] = bucket.get(i).get(j);
                    posi += 1;
                    k -= 1;
                }
            }
        }
        
        return ans;
    }
}
