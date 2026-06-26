import java.awt.*;

public class ui_1 extends Frame {
    ui_1() {
        Button b1 = new Button("Submit");
        b1.setBounds(30, 100, 80, 30);
        add(b1);
        setSize(300, 300);
        setVisible(true);
        setLayout(null);
    }

    public static void main(String[] args) {
        new ui_1();

    }
}
