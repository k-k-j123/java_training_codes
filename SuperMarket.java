import java.util.Scanner;
import java.util.HashMap;

public class SuperMarket {
    public static int getPrice(int n) {
        int prod = 1;
        while (n != 0) {
            int digit = n % 10;
            prod *= digit;
            n = n / 10;
        }
        return prod;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> hm = new HashMap<>();
        System.out.println("Enter the number of the products");
        int n = sc.nextInt();

        System.out.println("Enter the product codes");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " : ");
            int code = sc.nextInt();
            int price = getPrice(code);
            hm.put(code, price);
        }

        int total = 0;
        System.out.println("\nCodes and Prices");
        for (Integer key : hm.keySet()) {
            System.out.println(key + " : " + hm.get(key));
            total += hm.get(key);
        }

        System.out.println("\nYour total is "+total);

        sc.close();

        
    }
}
