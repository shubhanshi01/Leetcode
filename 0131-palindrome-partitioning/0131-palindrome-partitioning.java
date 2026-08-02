class Solution {
    public void palindrome(String s,List<String> arr,List<List<String>>ans,int start){
        if(start==s.length()){
            ans.add(new ArrayList<>(arr));
            return ;
        }

        for(int end=start;end<s.length();end++){
            if(isPalindrome(s,start,end)){
                arr.add(s.substring(start,end+1));
                palindrome(s,arr,ans,end+1);
                arr.remove(arr.size()-1);



            }

        }



    }

       private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList<>();
        List<String> arr=new ArrayList<>();
        palindrome(s,arr,ans,0);

        return ans;
    }
}