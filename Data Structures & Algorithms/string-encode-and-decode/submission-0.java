class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedS = new StringBuilder();
        for(String str : strs){
            encodedS.append(str.length()).append('#').append(str);
        }
        return encodedS.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedS = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j+1;
            j = i+length;
            decodedS.add(str.substring(i, j));
            i = j;
        }
        return decodedS;
    }
}
