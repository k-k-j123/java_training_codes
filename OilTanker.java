public class OilTanker {
    public static void main(String args[]){
        int capacity = 3;
        int oil = 0;
        int[] arr = {-1,-1,1,1,1,1};

        int initialBuyers=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                break;
            }
            initialBuyers++;
        }

        oil = initialBuyers;

        System.out.println("Minimum oil " + initialBuyers);

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                oil++;
                if(oil>capacity){
                    System.out.print("Overflow");
                }
            }else{
                oil--;
            }

        }
    }
}
