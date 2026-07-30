class Solution {
    public void permutation(List<List<Integer>> arr,int index,int[] nums,List<Integer> subset)
    {
        if(index==nums.length){
            arr.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        permutation(arr,index+1,nums,subset);
        subset.remove(subset.size() - 1);
         permutation(arr,index+1,nums,subset);
        
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> subset=new ArrayList<>();
        permutation(arr,0,nums,subset);
        return arr;


    }
}