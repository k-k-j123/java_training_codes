public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int largest = arr[0];
        int secondLargest = arr[0];

        for(int i : arr){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            if(arr[i]!=largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }
}
