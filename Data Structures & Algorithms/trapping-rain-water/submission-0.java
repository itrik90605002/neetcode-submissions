class Solution {
    public int trap(int[] height) {
        if(height.length == 0){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int total_water_trapped = 0;
        for(int i = 0; i < height.length;i++){
            while(!stack.isEmpty() && height[i] >= height[stack.peek()]){
                int bottom = height[stack.pop()];
                if(!stack.isEmpty()){
                    int right = height[i];
                    int left = height[stack.peek()];
                    int water_height = Math.min(left, right) - bottom;
                    int width_of_bottom = i - stack.peek() - 1;
                    total_water_trapped += water_height * width_of_bottom;
                }
            }
            stack.push(i);
        }
        return total_water_trapped;
    }
}
