class MissingNumber{
     public static void main(String[] args) {
         int[] arr = {1,2,4,5,6};
        
        // for(int i=0;i<arr.length;i++){
        //     if((arr[i+1]-arr[i])!=1){
        //         System.out.println(arr[i]+1);
        //         break;
        //     }
        // }

        int n = arr.length;

        int expectedSum = n * (n+1) /2;

        int actualSum = 0;
        for(int i : arr){
            actualSum += i;
        }

        System.out.println(expectedSum - actualSum);
        
    }
}