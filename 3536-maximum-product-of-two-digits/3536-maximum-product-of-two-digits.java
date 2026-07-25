class Solution {
    public int maxProduct(int n) {
       
        int largest=0;
        int second=0;
        int maxproduct=0;
       int x=1;

        while(n!=0){

            x=n%10;
        
            n=n/10;

           if(x>=largest){
            second=largest;
            largest=x;
           }
           else if(x>=second){
            second=x;
           }


          
        

        }

         maxproduct=largest*second;

         return maxproduct;

    }
}