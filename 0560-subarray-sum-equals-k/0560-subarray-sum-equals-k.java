class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        int n=nums.length;
        hash.put(0,1);
        int prefixSum=0;
        int count=0;
        for(int i:nums)
        {
            prefixSum+=i;
            if(hash.containsKey(prefixSum-k)){
                count+=hash.get(prefixSum-k);
            }

            hash.put(prefixSum,hash.getOrDefault(prefixSum,0)+1);


        }

        return count;

    }
}