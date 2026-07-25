class Solution {
   Stack<Character> stack=new Stack();
    public boolean isValid(String s) {
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else
            {if(stack.empty())
                return false;

                char top=stack.pop();
                if ((s.charAt(i) == ')' && top == '(') ||
                    (s.charAt(i) == ']' && top == '[') ||
                    (s.charAt(i) == '}' && top == '{'))
                    continue;

                else{
                    return false;
                }
            
            }


        }

        if(stack.empty()){
            return true;
        }
        return false;
    }
}