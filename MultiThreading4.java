class BusBooking {
    int seats = 10;

    void booking(int s) {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello " + name);
        }
        //block level sync
        synchronized(this){
            if (s <= seats) {
                seats = seats - s;
                System.out.println(name + " Seats booked successfully");
                System.out.println("available:"+seats);
            } else {
                System.out.println(name + " Insufficient seats");
                System.out.println("available:"+seats);
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Bye " + name);
        }
    }
}

public class MultiThreading4 extends Thread {

    int s;
    static BusBooking op;

    public void run() {
        op.booking(s);
    }

    public static void main(String args[]) {

        op = new BusBooking();
        MultiThreading4 t1 = new MultiThreading4();
        MultiThreading4 t2 = new MultiThreading4();
        t1.setName("kaushik");
        t2.setName("harsh");

        t1.s = 6;
        t2.s = 7;

        t1.start();
        t2.start();
    }
}
