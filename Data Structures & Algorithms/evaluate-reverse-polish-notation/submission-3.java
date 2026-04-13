class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length; i++){
            System.out.println(i);
            if(tokens[i].equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if(tokens[i].equals("-")){
                stack.push(0 - (stack.pop() - stack.pop()));
            }
            else if(tokens[i].equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(tokens[i].equals("/")){
                int secondNum = stack.pop();
                int firstNum = stack.pop();
                stack.push(firstNum / secondNum);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}
