class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st =new Stack<>();
        
        int n=temp.length;
        int [] arr=new int[n];
        int previos=0;
        for(int i=0;i<n;i++){

            while(!st.empty() && temp[i]>temp[(st.peek())]){
                previos=st.pop();
                arr[previos]=i-previos;

            }

            st.push(i);
        }

        return arr;
    }
}