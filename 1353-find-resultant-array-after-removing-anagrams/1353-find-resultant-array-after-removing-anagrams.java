class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans=new ArrayList<>();
        int n=words.length;
       int i = 0;

        while (i < n) {
            int j = i + 1;
            while (j < n && isanagram(words[i], words[j])) {
                j++;
            }
            ans.add(words[i]);
            i = j;
        }
        return ans;
    }
    public static boolean isanagram(String str1,String str2)    {
        if(str1.length()!=str2.length())return false;

        char[] s1Array = str1.toCharArray();
        char[] s2Array = str2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        return Arrays.equals(s1Array, s2Array);

    }
}