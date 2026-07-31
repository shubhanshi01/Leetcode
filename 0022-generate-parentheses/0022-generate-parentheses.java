class Solution {
    
    public void generate(StringBuilder para, List<String> arr,int n,int open,int close){
        if(para.length()==2*n){
            arr.add(para.toString());
            return;
        }
        if(open<n){
            para.append("(");
            generate(para,arr,n,open+1,close);
            para.deleteCharAt(para.length()-1);

        }
        if(close<open){
            para.append(")");
            generate(para,arr,n,open,close+1);
            para.deleteCharAt(para.length()-1);

        }
       
        
    }
    
    public List<String> generateParenthesis(int n) {
        StringBuilder para=new StringBuilder();
        List<String> arr=new ArrayList<>();
     


        generate(para,arr,n,0,0);

        return arr;
    }
}