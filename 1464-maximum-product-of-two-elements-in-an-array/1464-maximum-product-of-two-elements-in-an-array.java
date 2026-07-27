class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        if(nums[i]>largest){
            second=largest;
            largest=nums[i];
        }
        else if(nums[i]>second){
            second=nums[i];

        }

       } 

       int product=(largest-1)*(second-1);

       return product;
    }
}