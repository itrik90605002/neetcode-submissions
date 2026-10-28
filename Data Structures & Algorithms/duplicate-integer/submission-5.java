class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
        // Arrays.sort(nums);
        // int i = 0;
        // int j = i + 1;
        // while(i < j && j < nums.length){
        //     if(nums[i] == nums[j]){
        //         return true;
        //     }
        //     i++;
        //     j++;
        // }
        // return false;
    }
}