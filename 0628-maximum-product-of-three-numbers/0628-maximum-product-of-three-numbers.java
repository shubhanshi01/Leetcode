class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        int product=1;
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        int secondSmall=Integer.MAX_VALUE;
        int small=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            
            if(nums[i]>largest){
                third=second;
                second=largest;
                largest=nums[i];
            }

            else if(nums[i]>second  ){
                third=second;
                second =nums[i];
            }

            else if(nums[i]>third ){
                third=nums[i];
            }
            

            if(nums[i]<small){
                secondSmall=small;
                small=nums[i];
                

            }

            else if(nums[i]<secondSmall ){
                secondSmall=nums[i];
            }
            
        }

        product=largest*second*third;

        int productl=largest*secondSmall*small;

        product=Math.max(product,productl);

        return product;
    }
}