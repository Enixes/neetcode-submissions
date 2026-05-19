class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            ans.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList(ans.values());
    }
}
