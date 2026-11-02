class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Putting all numers of nums array in key value pair.
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //Sorting the map by its value using ArrayList
        List<Map.Entry<Integer, Integer>> sortMap = new ArrayList<>(map.entrySet());
        Collections.sort(sortMap,(a,b) -> b.getValue() - a.getValue());

        //Now creating the array for most k frequent numbers of original array nums.
        int[] kFreqNums = new int[k];
        for(int i = 0;i < k;i++){
            kFreqNums[i] = sortMap.get(i).getKey();
        }
        return kFreqNums;
    }
}
