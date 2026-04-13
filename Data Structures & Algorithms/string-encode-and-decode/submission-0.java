class Solution {

    public String encode(List<String> strs) {
        StringBuilder singleString = new StringBuilder();
        for(int i = 0; i < strs.size(); i++){
            singleString.append(strs.get(i).length());
            singleString.append("#");
            singleString.append(strs.get(i));
        }
        return(singleString.toString());
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int posi = 0;
        while(posi < str.length()){
            StringBuilder sizeOfString = new StringBuilder();
            while(posi < str.length() && Character.isDigit(str.charAt(posi))){
                sizeOfString.append(str.charAt(posi));
                posi += 1;
            }
            if(posi < str.length() && str.charAt(posi) == '#'){
                posi += 1;
            } 
            int size = Integer.parseInt(sizeOfString.toString());
            String curString = str.substring(posi, posi + size);
            ans.add(curString);
            posi = posi + size;
        }
        return ans;
    }
}
