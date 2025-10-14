class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        
        int count=1;
        int prev=0;
        int n=nums.size();

        for(int i=1;i<n;i++){

            if(nums.get(i)>nums.get(i-1)){
                count++;

            }else{

                prev=count;
                count=1;
            }

            if(count/2 >=k || Math.min(prev,count)>=k){
                return true;
            }

        }
        return false;
    }
}