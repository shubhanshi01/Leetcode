class Solution {
public:
    vector<vector<int>> generate(int n) {
        vector<vector<int>> arr;
  for(int i=0;i<n;i++){
     arr.push_back(vector<int>(i + 1));
        for(int j=0;j<=i;j++){
            if(j==0 || j==i){
                arr[i][j]=1;

            }
            else{
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }

        }

        }
        return arr;
    }
};