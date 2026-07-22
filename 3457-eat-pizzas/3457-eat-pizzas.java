class Solution {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);
        int n=pizzas.length;
        int days=n/4;
        int odd=(days+1)/2;
        int r=n-1;
        long ans=0;
        int even=days/2;

        for(int i=0;i<odd;i++){
            ans+=pizzas[r];

            r--;

        }

        for(int i=0;i<even;i++){
            r--;
            ans+=pizzas[r];

            r--;

        }

        return ans;
    }
}