import java.util.*;

public class City {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Collection<String> al = new ArrayList<>();

        System.out.println("Enter the number of cities:");
        int n = sc.nextInt();
        System.out.println("Enter cities");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + " city: ");
            al.add(sc.next());
        }
        sc.close();

        System.out.println("\nCities are: " + al.toString());
    }
}
