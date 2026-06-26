public class TrappingRainWater {
    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1;
        int res = 0;
        while(i<j){
            int h = Math.min(height[i],height[j]);
            int w = Math.abs(j-i);

            res = Math.max(res, (h*w));
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.err.println(maxArea(height));

    }
}
