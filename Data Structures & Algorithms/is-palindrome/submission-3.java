class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            while(!(Character.isLetterOrDigit(s.charAt(start)))){
                start++;
                if(start >= end){
                    return true;
                }
            } 
            while(!(Character.isLetterOrDigit(s.charAt(end)))){
                end--;
                if(start >= end){
                    return true;
                }
            }
            if(!(String.valueOf(s.charAt(start)).equalsIgnoreCase(String.valueOf(s.charAt(end))))) return false;
            start++;
            end--;
        }
        return true;
    }
}
