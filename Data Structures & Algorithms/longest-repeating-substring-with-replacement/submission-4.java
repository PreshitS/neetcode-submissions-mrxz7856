class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int[] count = new int[26];
        int n = s.length();
        while(right < n){
            int windowLen = right - left + 1;
            count[s.charAt(right) - 'A']++;
            if(windowLen - Arrays.stream(count).max().getAsInt() <= k){
                maxLen = Math.max(maxLen, windowLen);
            }
            else{
                count[s.charAt(left) - 'A']--;
                left++;
            }
            right++;
        }
        return maxLen;
    }
}
