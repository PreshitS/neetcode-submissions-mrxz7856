class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        Deque<Integer> q = new LinkedList<>();
        int[] output = new int[n - k + 1];

        while(r < n){
            while(!q.isEmpty() && nums[r] > nums[q.getLast()]){
                q.removeLast();
            }

            q.addLast(r);

            if(l > q.getFirst()){
                q.removeFirst();
            }

            if((r - l + 1) >= k){
                output[l] = nums[q.getFirst()];
                l++;
            }
            r++;
        }

        return output;
    }
}
