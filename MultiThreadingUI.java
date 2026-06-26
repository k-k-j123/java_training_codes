
//MultiThreading + GUI + Event Handling;
import java.awt.*;
import java.awt.event.*;

class BookingSystem extends Thread {

    static int available = 10;
    int seat;
    String user;

    BookingSystem(int seat, String ThreadName) {
        this.seat = seat;
        this.user = ThreadName;
    }

    public synchronized void run() {
        synchronized (this) {
            if (seat <= available) {
                available -= seat;
                BookingGUI.ta.append(user + " " + seat + " seats are booked\n");
            } else {
                BookingGUI.ta.append(user + " Sorry seats are not booked\n");
            }
        }
    }

}

class BookingGUI extends Frame implements ActionListener {

    Label l1, l2, l3;
    TextField tfName, tfSeats;
    Button b;
    static TextArea ta;

    BookingGUI() {

        setTitle("MultiThreading Bus Booking system");
        setSize(600, 350);
        setLayout(new FlowLayout());
        setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                System.exit(0);
            }
        });

        l1 = new Label("Enter Username: ");
        tfName = new TextField(15);

        l2 = new Label("Enter Number of seats to book (comma separated): ");
        tfSeats = new TextField(25);

        l3 = new Label("Enter seat numbers separated by commas. eg - 4,6,7,8");

        b = new Button("Book");
        b.addActionListener(this);

        ta = new TextArea();
        ta.setEditable(false);

        add(l1);
        add(tfName);
        add(l2);
        add(tfSeats);
        add(b);
        add(l3);
        add(ta);

    }

    public void actionPerformed(ActionEvent e) {

        try {

            String baseName = tfName.getText().trim();
            String[] seatArray = tfSeats.getText().trim().split(",");

            for (int i = 0; i < seatArray.length; i++) {
                int seat = Integer.parseInt(seatArray[i].trim());
                String ThreadName = baseName + " - " + (i + 1);

                BookingSystem op = new BookingSystem(seat, ThreadName);
                op.start();

            }

            l3.setText("Booking request sent for " + seatArray.length + " Users");

        } catch (NumberFormatException ex) {
            l3.setText("ERROR : Please enter valid seat numbers separated by commas");
        }

    }
}

public class MultiThreadingUI {
    public static void main(String[] args) {
        new BookingGUI();
    }
}
