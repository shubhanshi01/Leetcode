class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> stack=new Stack<>();
        int[] leftMost=new int[n];
        int[] rightMost=new int[n];
        int max_area=0;
        
        for(int i=0;i<n;i++){
            leftMost[i]=-1;
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(!stack.isEmpty())
            {
                leftMost[i]=stack.peek();
            }
            stack.push(i);
        }

        stack.clear();
        for(int i=n-1;i>=0;i--){
            rightMost[i]=n;
            while(!stack.isEmpty()&& heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                rightMost[i]=stack.peek();

            }

            stack.push(i);

        }

        int maxArena=0;
        for(int i=0;i<n;i++){
            leftMost[i]+=1;
            rightMost[i]-=1;
            maxArena=Math.max(maxArena,heights[i]*(rightMost[i]-leftMost[i]+1));

        }

        return maxArena;


        
    

    
    }
}