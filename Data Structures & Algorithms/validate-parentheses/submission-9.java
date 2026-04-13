class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int j = 0; j < s.length(); j++){
            char i = s.charAt(j);
            if(i == '(' || i == '[' || i == '{'){
                stack.push(i);
            }
            else{
                if(i == ')'){
                    if(!stack.empty() && stack.peek() == '('){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else if(i == ']'){
                    if(!stack.empty() && stack.peek() == '['){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    if(!stack.empty() && stack.peek() == '{'){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
}
