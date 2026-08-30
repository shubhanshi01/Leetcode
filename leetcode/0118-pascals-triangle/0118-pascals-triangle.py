class Solution:
    def generate(self, numRows: int) -> List[List[int]]:

        arr=[]
        for rows in range(numRows):
            in_arr=[]
            for cols in range(rows+1):

                
                if(cols==0 or  cols==rows):
                    in_arr.append(1)
                else:
                    val=arr[rows-1][cols]+arr[rows-1][cols-1]
                    in_arr.append(val)
            arr.append(in_arr)

        return arr


        