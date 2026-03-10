//Multithreading in java
/*
Thread - Thread is a per defined class which is available in the lang pkg. and Thread is the smallest unit of execution/CPU.
		 Thread should be independant to other threads.
Step 1. Import java.lang pkg
Step 2. A) by Extending thread class OR B) by implementing Runnable interface (best approach for security)
Step 3. initialize run() method 
Step 4. give public access to run method
Step 5. implement the run method
Step 6. Creating the number of threads
Step 7. Start() the all threads

Thread life cycle 
	new 
	ready 
	executing
	waiting 
	dead
*/
class DYP_Print extends Thread{
	public void run(){
		try{
			for(int i=1;i<=3;i++)
			{
				System.out.println("Bye world");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e){
			
		}
	}
}
public class MultiThreading{
	public static void main(String args[]) {
		DYP_Print ob = new DYP_Print();
		ob.start();
		try{
			for(int i=1;i<=3;i++)
			{
				System.out.println("Hello world");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e){
			
		}
		
	}
}