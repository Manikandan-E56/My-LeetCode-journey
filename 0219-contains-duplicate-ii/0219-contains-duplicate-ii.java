class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            int val=nums[i];
            if(mp.containsKey(val) && i-mp.get(val)<=k){
                return true;
            }
            mp.put(val,i);

        }
        return false;
    }
}