import java.util.Scanner;

public class Diff2Dmatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int columns = sc.nextInt();

        System.out.println("Enter array elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int oddsum = 0;
        int evesum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                if ((i + j) % 2 == 0) {
                    evesum += arr[i][j];
                } else {
                    oddsum += arr[i][j];
                }
            }
        }

        System.out.println();
        if(evesum>oddsum){
            System.out.println(evesum-oddsum);
        }else{
            System.out.println(oddsum-evesum);
        }
        sc.close();
    }
}
