import java.util.*;
public class ThreeSum{
   public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;
        for (int i = 0; i < n; i++){
            if (i != 0 && nums[i] == nums[i-1]) continue;

            int j = i+1;
            int k = n-1;

            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){
                    j++;
                } else if (sum > 0){
                    k--;
                } else {
                    results.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                    while (j < k && nums[j] == nums[j-1]) j++;
                }
            }
        }
        return results;
    }

    public static void main(String args[]){
        int[] nums={-1,0,1,2,-1,-4};

        List<List<Integer>> res = threeSum(nums);

        System.out.println(res);
    }
}
