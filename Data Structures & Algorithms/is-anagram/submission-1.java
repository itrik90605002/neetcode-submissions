class Solution {
    public boolean isAnagram(String s, String t) {
        String sstr = s.replaceAll("[^a-zA-Z0-9]","");
        String tstr = t.replaceAll("[^a-zA-Z0-9]","");
        if(sstr.length() != tstr.length()){
            return false;
        }
        Map<Character, Integer> SCount = new HashMap<>();
        Map<Character, Integer> TCount = new HashMap<>();
        for(int i = 0;i < sstr.length();i++){
            SCount.put(sstr.charAt(i), SCount.getOrDefault(sstr.charAt(i), 0) + 1);
            TCount.put(tstr.charAt(i), TCount.getOrDefault(tstr.charAt(i), 0) + 1);
        }
        return SCount.equals(TCount);
    }
}
