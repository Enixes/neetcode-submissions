class Solution {

    public String encode(List<String> strs) {
        StringBuilder strB = new StringBuilder();
        for (String str : strs) {
            strB.append(str.length());
            strB.append('#');
            strB.append(str);
        }
        return strB.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> ans = new ArrayList<>();
        while(i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#')
                j++;
            
            int stringSize = Integer.parseInt(str.substring(i, j));
            String subStr = str.substring(j + 1, j + stringSize + 1);
            i = j + stringSize + 1;
            ans.add(subStr);
        }
        return ans;
    }
}
