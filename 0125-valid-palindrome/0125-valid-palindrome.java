class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==1){
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "");
       s= s.toLowerCase();
        int r=0;
        int l=s.length()-1;
        while(r<l){
            if(s.charAt(r)!=s.charAt(l))return false;
            r++;
            l--;
        }
        return true;
    }
}