import java.util.Scanner;

public class Rotate2dArray{
    static void print(int[][] arr, int row, int columns){
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int columns = sc.nextInt();

        System.out.println("Enter array elements");
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Array elements are:");
        print(arr, row, columns);

        //transpose
        //int[][] transpose = new int[row][columns];
        for(int i=0;i<row;i++){
            for(int j=i;j<columns;j++){
               int temp = arr[i][j];
               arr[i][j] = arr[j][i];
               arr[j][i] = temp;
            }
        }

        System.out.println("Transpose of matrix is ");
        print(arr, row, columns);

        for(int i=0;i<row;i++){
            //applying the two pointer on subarrays
            int start = 0;
            int end = row-1;

            while(start < end){ 
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                start++;
                end--;
            }
        }

        System.out.println("Rotated array is ");
        print(arr, row, columns);

        sc.close();
    }

}