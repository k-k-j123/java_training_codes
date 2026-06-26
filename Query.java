import java.util.Scanner;

public class Query {
    public static int[] Q1(int[] arr, int l, int r) {
        for (int i = l; i <= r; i++) {
            arr[i] = (i - l + 1) * arr[l];
        }
        return arr;
    }

    public static int Q2(int[] arr, int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the values of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();

        int sumQ2=0;
        for (int i = 0; i < q; i++) {
            System.out.print("Enter type of query: ");
            int x = sc.nextInt();

            System.out.print("\nEnter l value: ");
            int l = sc.nextInt();

            System.out.print("\nEnter r value: ");
            int r = sc.nextInt();

            switch (x) {
                case 1:
                    arr = Q1(arr, l, r);
                    break;
                case 2: 
                    int sum = Q2(arr, l, r);
                    System.out.println("Sum for current Query q2:"+sum);
                    sumQ2+=sum;

            }
        }

        System.out.println("\nSum of all answers of type 2 queries");
        System.out.println(sumQ2);

        sc.close();
    }
}
