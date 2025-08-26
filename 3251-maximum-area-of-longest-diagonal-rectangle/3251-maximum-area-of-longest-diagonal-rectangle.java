class Solution {
    public int areaOfMaxDiagonal(int[][] di) {
        int m=di[0].length;
        int n=di.length;
        int ans=0;
        int mx=0;
        for(var i :di){
            int l=i[0],w=i[1];
            int t=l*l+w*w;
            if(mx<t){
                mx=t;
                ans=l*w;

            }else if(mx==t){
                ans=Math.max(ans,l*w);
            }

            
        }
        return ans;
    }
}