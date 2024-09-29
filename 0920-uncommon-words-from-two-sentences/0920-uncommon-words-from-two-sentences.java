class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap();
        String s1Str[] = s1.split(" ");

        for (String word : s1Str) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        String s2Str[] = s2.split(" ");

        for (String word : s2Str) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String i : map.keySet()) {

            if (map.get(i) == 1) {
                list.add(i);
            }
        }
        String ans[] = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}