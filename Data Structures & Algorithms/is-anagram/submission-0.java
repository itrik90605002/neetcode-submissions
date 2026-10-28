class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> SCount = new HashMap<>();
        Map<Character, Integer> TCount = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            SCount.put(s.charAt(i), SCount.getOrDefault(s.charAt(i), 0) + 1);
            TCount.put(t.charAt(i), TCount.getOrDefault(t.charAt(i), 0) + 1);
        }
        return SCount.equals(TCount);
    }
}
