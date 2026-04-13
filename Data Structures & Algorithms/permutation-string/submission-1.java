class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(int i = 0; i < s1.length(); i++){
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for(int i = 0; i < 26; i++){
            if(count1[i] == count2[i]){
                matches++;
            }
        }

        int l = 0;
        int r = s1.length();
        
        while(r < s2.length()){
            if(matches == 26) return true;

            count2[s2.charAt(r) - 'a']++;
            if(count2[s2.charAt(r) - 'a'] == count1[s2.charAt(r) - 'a']){
                matches++;
            }
            else if(count2[s2.charAt(r) - 'a'] == count1[s2.charAt(r) - 'a'] + 1){
                matches--;
            }

            count2[s2.charAt(l) - 'a']--;
            if(count2[s2.charAt(l) - 'a'] == count1[s2.charAt(l) - 'a']){
                matches++;
            }
            else if(count2[s2.charAt(l) - 'a'] == count1[s2.charAt(l) - 'a'] - 1){
                matches--;
            }
            l++;
            r++;
        }
        return matches == 26;
    }
}
