public class SquareSortedArray{
    public static int[] sortedSquares(int[] nums) {

        int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        int[] result = new int[nums.length];
        while (i<=j){
            int isq=nums[i]*nums[i];
            int jsq=nums[j]*nums[j];

            if(isq>jsq){
                result[k]=isq;
                i++;
            }else{
                result[k]=jsq;
                j--;
            }
            k--;
        }
        return result;
    }

    public static void main(String args[]){
        int[] nums = {-4,-1,0,3,10};

        int[] res = sortedSquares(nums);
        for(int x : res){
            System.out.print(x+" ");
        }

    }
}
