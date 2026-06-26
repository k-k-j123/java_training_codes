public class Segregate01 {
    static void segregate0and1(int[] arr) {
        // code here
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            while (i < j && arr[i] != 1) {
                i++;
            }
            while (i < j && arr[j] != 0) {
                j--;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        segregate0and1(arr);
    }
}
