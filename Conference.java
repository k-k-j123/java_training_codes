import java.util.Scanner;
public class Conference {
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of members:");
        int n = sc.nextInt(); 
        int res = 2 * factorial(n-2);
        System.out.println("number of ways : " + res);
        sc.close();
    }
}
