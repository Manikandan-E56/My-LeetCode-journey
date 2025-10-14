class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> ans = new HashMap<>();

        for(String str:strs){
            char []ch=str.toCharArray();

            Arrays.sort(ch);

            String key=String.valueOf(ch);

            ans.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(ans.values());
    }
}