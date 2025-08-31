class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][]=new int[n][n];
         int top=0;
        int bottom=ans.length-1;
        int left=0;
        int right=ans[0].length-1;
        int number=1;
        
        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                ans[top][i]=number;
                number++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                ans[i][right]=number;
                number++;
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans[bottom][i]=number;
                    number++;
                }
            }
            bottom--;

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans[i][left]=number;
                    number++;
                }
            }
            left++;
        }
        return ans;
    }
}