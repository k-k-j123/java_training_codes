/*
without multithreading --

import java.util.Scanner;
public class MultiThreading2{
	
	public static void main(String args[]){
		
		int seats = 5;
		Scanner sc = new Scanner(System.in);
		System.out.print("Hello Enter your name: ");
		String name = sc.next();
		System.out.print("\nHello "+ name );
		while(seats > 0)
		{
			System.out.print("\nSeats available: "+seats);
			System.out.print("\nPlease enter number of seats: ");
			
			int s = sc.nextInt();
			if(s <= seats)
			{
				seats -= s;
				System.out.println("\nSeats booked successfully");
			}
			else
			{
				System.out.println("Insufficient seats");
			}
		}
	}	
}	
*/

class SeatBooking extends Thread
{	
	int seats = 5;
	String name;
	int s;
	public SeatBooking(int s)
	{
		this.s = s;
	}
	public synchronized void run()
	{
			String name = Thread.currentThread().getName();
			if(s <= seats)
			{
				seats = seats - s;
				System.out.println(name + " Seats booked successfully");
			}
			else
			{
				System.out.println(name + " Insufficient seats");
			}
		
	}
}
public class MultiThreading2
{
	public static void main(String args[]){
		SeatBooking op = new SeatBooking(2);
		
		Thread t1 = new Thread(op);
		Thread t2 = new Thread(op);
		Thread t3 = new Thread(op);
		
		t1.setName("kaushik");
		t2.setName("harsh");
		t3.setName("tanmay");
		
		t1.start();
		t2.start();
		t3.start();
	}
}