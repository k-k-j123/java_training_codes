import java.util.Scanner;

public class Ops2Dmatrix {

    public static void addition(int[][] arr, int row, int col) {
        int evensum = 0;
        int oddsum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ((i + j) % 2 == 0) {
                    evensum += arr[i][j];
                } else {
                    oddsum += arr[i][j];
                }
            }
        }

        System.out.println();
        if (evensum > oddsum) {
            System.out.println(evensum - oddsum);
        } else {
            System.out.println(oddsum - evensum);
        }
    }

    public static void subtraction(int[][] arr, int row, int col) {
        int evensum = 0;
        int oddsum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if ((i - j) % 2 == 0) {
                    evensum -= arr[i][j];
                } else {
                    oddsum -= arr[i][j];
                }
            }
        }

        System.out.println();
        if (evensum > oddsum) {
            System.out.println(evensum - oddsum);
        } else {
            System.out.println(oddsum - evensum);
        }
    }

    public static void multiplication(int[][] arr, int row, int col) {
        int evenprod = 1;
        int oddprod = 1;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if ((i * j) % 2 == 0) {
                    evenprod *= arr[i][j];
                } else {
                    oddprod *= arr[i][j];
                }

            }
        }

        // System.out.println(evenprod+ " " +oddprod);
        if (evenprod > oddprod) {
            System.out.println(evenprod - oddprod);
        } else {
            System.out.println(oddprod - evenprod);
        }
    }

    public static void Division(int[][] arr, int row, int col) {
        double evendiv = 1;
        double oddDiv = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int x;
                if (j == 0) {
                    x = 0;
                } else {
                    x = i / j;
                }

                if (arr[i][j] == 0) {
                    evendiv = 0; 
                } else if (x % 2 == 0) {
                    evendiv /= arr[i][j];
                } else {
                    oddDiv /= arr[i][j];
                }

            }
        }

        System.out.println(evendiv + " " + oddDiv);
        if (evendiv > oddDiv) {
            System.out.println(evendiv - oddDiv);
        } else {
            System.out.println(oddDiv - evendiv);
        }
    }

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

        int ch;
        System.out.println("Choose your operation\n");
        System.out.println("\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
        System.out.print("\nChoice:");
        ch = sc.nextInt();

        switch (ch) {
            case 1:
                addition(arr, row, columns);
                break;
            case 2:
                subtraction(arr, row, columns);
                break;
            case 3:
                multiplication(arr, row, columns);
                break;
            case 4:
                Division(arr, row, columns);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();

    }
}
