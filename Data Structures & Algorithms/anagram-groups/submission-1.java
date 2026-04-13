class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            int[] count = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                count[strs[i].charAt(j) - 'a']++;
            }
            
            StringBuilder key = new StringBuilder();
            for (int k : count) {
                key.append(k);
                key.append("#");
            }

            System.out.println(key);

            if (map.containsKey(key.toString())) {
                map.get(key.toString()).add(strs[i]);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                map.put(key.toString(), temp);
            }
        }

        for (List<String> group : map.values()) {
            ans.add(group);
        }

        return ans;
    }
}
