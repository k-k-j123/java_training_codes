public class PrimeNum {

    public static void main(String args[]) {

        int n = 40;

        boolean arr[] = new boolean[n + 1];
    
        for (int i = 2; i * i <= n; i++) {
            if (arr[i] == false) { //to check if arr[i] is already marked by another prime 
                // in this case the multiples are marked true 
                for (int j = i*2; j <= n; j += i) { // i*2 because we dont want to mark the prime itself
                    arr[j] = true;
                }
            }
        }
        
        for(int i=2;i<arr.length;i++){
            if(arr[i]==false){
                System.out.print(i+" ");
            }
        }
        
    }
}
