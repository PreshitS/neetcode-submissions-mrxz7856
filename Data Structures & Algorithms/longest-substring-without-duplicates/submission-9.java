class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        while(end < s.length()){
            if(map.containsKey(s.charAt(end))){
                start = Math.max(map.get(s.charAt(end)) + 1, start);
            }
            map.put(s.charAt(end), end);
            maxLength = Math.max(maxLength, end - start + 1);
            end++;
        }

        return maxLength;
    }
}
