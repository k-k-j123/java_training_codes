import java.util.Scanner;

public class SundayCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of days");
        int n = sc.nextInt();

        System.out.println("Enter first day (1=Mon ... 7=Sun)");
        int day = sc.nextInt();

        int sun = 0;

        for(int i = 1; i <= n; i++) {

            if(day == 7) {
                sun++;
            }

            day++;      
                
            if(day > 7) {   
                day = 1;
            }
        }

        System.out.println("Sundays: " + sun);
        sc.close();
    }
}
