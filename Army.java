import java.util.Scanner;

public class Army {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of soldiers");
        long n = sc.nextInt();
        int moves = 0;
        while(n>1) {
        		//1.move 1
        	 	long op1 = n - 1;
        		
        		//move 2
        	 	long op2 = Math.ceilDiv(n,2); 
        		
        		//move 3
        	 	long op3 = n * Math.floorDiv(2*n,3);
        	 
        	 	long next = Math.min(op1, Math.min(op2, op3));
        	 	
        	 	n = next;
        	 	moves++;
        }
        System.out.println("Minimum number of moves: "+moves);
        sc.close();
    }
}
