class Solution {

    public void perm(int[]nums,List<List<Integer>>arr,boolean[] used,List<Integer> comb){
        if(comb.size()==nums.length){
            arr.add(new ArrayList<>(comb));
            return;
        }
        for(int i=0;i<nums.length;i++){
           if( used[i])
           {
            continue;
           }

        
        used[i]=true;
        comb.add(nums[i]);
        perm(nums,arr,used,comb);
        comb.remove(comb.size()-1);
         perm(nums,arr,used,comb);
         used[i]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> comb=new ArrayList<>();
        boolean[] used=new boolean[nums.length];
        perm(nums,arr,used,comb);

        return arr;
    }
}