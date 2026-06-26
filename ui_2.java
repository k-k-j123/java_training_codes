import java.awt.*;
import java.awt.event.*;
public class ui_2 extends Frame{

    Label l1;
    ui_2(){
        l1 = new Label("This code is for window closing");
        this.add(l1);
        //window closing code
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent w){
                System.exit(0);
            }
        });

        setTitle("DYP MCA");
        setSize(300,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ui_2();
    }
}
