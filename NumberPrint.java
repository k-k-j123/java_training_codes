import java.util.Collection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class NumberPrint {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Collection<Integer> al = new ArrayList<>();

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter number");

        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }

        System.out.println("\nNegative numbers are");
        Iterator<Integer> it = al.iterator();

        while(it.hasNext()){
            int x = it.next();
            if(x<0){
                System.out.print(x+ " ");
            }
        }
        sc.close();
    }
}
