class Solution {
    public void  perm(int[] candidates, int target,int i, List<Integer>sum,List<List<Integer>>arr){

        if(target==0){
            arr.add(new ArrayList<>(sum));
            return;
        }

        for (int j =i; j < candidates.length; j++) {

            // Avoid duplicate combinations at the same recursion level
            if (j > i && candidates[j] == candidates[j - 1]) {
                continue;
            }
        }

        if(i==candidates.length ||target<0){
            
            return;
        }

        sum.add(candidates[i]);
        perm(candidates,target-candidates[i],i,sum,arr);
        sum.remove(sum.size()-1);
        perm(candidates,target,i+1,sum,arr);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> sum=new ArrayList<>();
        perm(candidates,target,0,sum,arr);

        return arr;
    }
}