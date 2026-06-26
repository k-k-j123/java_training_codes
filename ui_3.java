import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ui_3 extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    JButton b1, b2, b3;
    JFrame f1;

    ui_3() {

        f1 = new JFrame("Flow Layout ex");
        l1 = new JLabel("Enter your name");
        l2 = new JLabel("Enter your city");
        l3 = new JLabel();
        l4 = new JLabel();
        t1 = new JTextField(15);
        t2 = new JTextField(15);
        b1 = new JButton("clear");
        b2 = new JButton("submit");
        b3 = new JButton("exit");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(l3);
        f1.add(l4);

        f1.setVisible(true);
        f1.setLayout(new FlowLayout());
        f1.setSize(300, 200);
        f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String op = e.getActionCommand();
        if (op == "clear") {
            t1.setText("");
            t2.setText("");
        }

        if (op == "submit") {
            l3.setText("Name:" + t1.getText());
            l4.setText("City:" + t2.getText());
        }

        if(op == "exit"){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new ui_3();
    }
}
