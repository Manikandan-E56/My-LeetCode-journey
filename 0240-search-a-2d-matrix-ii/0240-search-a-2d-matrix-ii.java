class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(var i:matrix){
            int j=Arrays.binarySearch(i,target);
            if(j>=0)return true;
        }
        return false;
    }
}