import java.util.Scanner;

public class ArrayMaxCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elemnts");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int count = 1;
        int max = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
                count++;
            }
        }

        System.out.println("\n"+count);
        sc.close();
    }
    
}
