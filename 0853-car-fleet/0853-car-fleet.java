import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
         double[][] d=new double[n][2];

         for(int i=0;i<n;i++){
           d[i][0]=position[i];
           d[i][1]=speed[i];
         }

         Arrays.sort(d,(a,b)->Double.compare(b[0],a[0]));

         Stack<Double> st=new Stack<>();

         for(double[] p: d){
            st.push((double)(target-p[0])/p[1]);
            if(st.size()>=2 && st.peek()<=st.get(st.size()-2) ){
                st.pop();
            }

         }

         return st.size();
    }
}