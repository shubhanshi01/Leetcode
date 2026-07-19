class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hash1 =new HashSet<>();
        HashSet<Integer> hash2 =new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hash1.add(nums1[i]);


        }
        for(int i=0;i<nums2.length;i++){
            if(hash1.contains(nums2[i])){
                    hash2.add(nums2[i]);

            }
        }

       int[] ans = new int[hash2.size()];
        int i = 0;
        for (int num : hash2) {
            ans[i++] = num;
        }

        return ans;
        
    }
}