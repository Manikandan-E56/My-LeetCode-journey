class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n=nums.length;
        long ans=0;
        long count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                count++;
                ans=ans+count;
            }else{
                count=0;
            }
        }
        return ans;
    }
}