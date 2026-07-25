class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int num=0;
        int num2=0;
        int sum=Integer.parseInt(tokens[0]);
        for(String i :tokens){
               

                if(i.equals("+")){
                    num=st.pop();
                    num2=st.pop();
                    sum=num+num2;
                    st.push(sum);
                }
                else if(i.equals("-")){
                    num=st.pop();
                    num2=st.pop();
                    sum=num2-num;
                    st.push(sum);
                }
                else if(i.equals("*")){
                    num=st.pop();
                    num2=st.pop();
                    sum=num*num2;
                    st.push(sum);
                }
                else if(i.equals("/")){
                    num=st.pop();
                    num2=st.pop();
                    sum=num2/num;
                    st.push(sum);
                }

                else{
                 st.push(Integer.parseInt(i));
                }
            
                
            

        
        }
        if(st.empty())return 0;

        return sum;
    }
}