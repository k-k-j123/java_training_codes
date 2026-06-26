import java.util.Scanner;
public class TwoDimensionalMatrix {
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
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
