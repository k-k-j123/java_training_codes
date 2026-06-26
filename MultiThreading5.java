/*
    In java programming language every object have only one key,
    and this key is given to only one thread at all the time.

    Static synchronization --
*/
class Bank extends Thread {
    static int available = 5000;
    static int wm;

    public Bank(int wm) {
        this.wm = wm;
    }

    static synchronized void Blogic() {
        String name = Thread.currentThread().getName();
        if (available >= wm) {
            System.out.println(name + " Transaction successful");
            available = available - wm;
        } else {
            System.out.println(name + " sry");
        }
    }

    public void run(){
        Blogic();
    }

}

public class MultiThreading5 {
    public static void main(String[] args) {
        Bank op = new Bank(2000);
        Thread t1 = new Thread(op);
        Thread t2 = new Thread(op);

        Bank op1 = new Bank(2000);
        Thread t3 = new Thread(op1);
        Thread t4 = new Thread(op1);
     

        t1.setName("A");
        t2.setName("B");
        t3.setName("C");
        t4.setName("D");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
