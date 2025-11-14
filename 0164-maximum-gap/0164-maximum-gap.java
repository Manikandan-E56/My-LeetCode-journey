class Solution {
    public int maximumGap(int[] nums) {

        if(nums.length==1)return 0;

        Arrays.sort(nums);
        int max=0;

        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            max = Math.max(max,nums[i]-prev);
            prev=nums[i];

        }
        return max;
        
    }
}