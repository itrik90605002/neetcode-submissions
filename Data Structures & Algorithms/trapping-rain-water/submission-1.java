class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxleft = 0;
        int maxright = 0;
        int water = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= maxleft){
                    maxleft = height[left];
                }
                else{
                    water += maxleft - height[left];
                }
                left++;
            }
            else{
                if(height[right] >= maxright){
                    maxright = height[right];
                }
                else{
                    water += maxright - height[right];
                }
                right--;
            }
        }
        return water;
        // if(height.length == 0){
        //     return 0;
        // }
        // Stack<Integer> stack = new Stack<>();
        // int total_water_trapped = 0;
        // for(int i = 0; i < height.length;i++){
        //     while(!stack.isEmpty() && height[i] >= height[stack.peek()]){
        //         int bottom = height[stack.pop()];
        //         if(!stack.isEmpty()){
        //             int right = height[i];
        //             int left = height[stack.peek()];
        //             int water_height = Math.min(left, right) - bottom;
        //             int width_of_bottom = i - stack.peek() - 1;
        //             total_water_trapped += water_height * width_of_bottom;
        //         }
        //     }
        //     stack.push(i);
        // }
        // return total_water_trapped;
    }
}
