
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Calculator extends JPanel {

	Calculator(){
	    setLayout(new GridLayout(4, 4));

		JButton b0 = new JButton("0");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");

		JButton bs = new JButton("*");
		JButton bp = new JButton("*");
		JButton bm = new JButton("*");
		JButton bd = new JButton("/");
		JButton be = new JButton("=");
		JButton bo = new JButton(".");

		add(b1);
		add(b2);
		add(b3);
		add(bs);
		add(b4);
		add(b5);
		add(b6);
		add(bp);
		add(b7);
		add(b8);
		add(b9);
		add(bm);
		add(bo);
		add(b0);
		add(be);
		add(bd);

		setVisible(true);
		setSize(200, 200);

	}
}

class CardLayout1 extends JFrame implements ActionListener {
	JFrame jf;
	JPanel pp;
	CardLayout cd;

	CardLayout1() {
		jf = new JFrame("CardLayout Example");
		cd = new CardLayout();

		// Creting a main parent panel that will contain 2 child panle
		pp = new JPanel();

		// CReating 2 child panels.
		JPanel cp1 = new JPanel();
		JPanel cp2 = new JPanel();

		// Creating 2 Parent Buttons
		JButton b1 = new JButton("Numbers");
		JButton b2 = new JButton("Alphabets");

		// Creating 3 child buttons of Number(parent)
		JButton cn1 = new JButton("1");
		JButton cn2 = new JButton("2");
		JButton cn3 = new JButton("3");

		// Creating 3 child buttons of Aplha(parent)
		JButton an1 = new JButton("A");
		JButton an2 = new JButton("B");
		JButton an3 = new JButton("C");
		JButton an4 = new JButton("D");

		an4.addActionListener(this);

		// Adding cn1,cn2,cn3 button to cp1
		cp1.add(cn1);
		cp1.add(cn2);
		cp1.add(cn3);

		// Adding cn1,cn2,cn3 button to cp1
		cp2.add(an1);
		cp2.add(an2);
		cp2.add(an3);
		cp2.add(an4);

		// Setting the Positioning of the components parent panel(pp) that contain cp1
		// and cp2 to cardlayout.
		pp.setLayout(cd);

		// Adding cp1 and cp2 to parent panel(pp)
		pp.add(cp1, "Numbers");
		pp.add(cp2, "Alphabets");

		b1.addActionListener(this);
		b2.addActionListener(this);

		// setting container JFrame's layout to FlowLayout
		jf.setLayout(new FlowLayout());

		// Adding 2 Buttons to JFrame, this buttons(b1,b2) will remain commanly visible
		// to all panels
		jf.add(b1);
		jf.add(b2);

		// Adding pp to jf
		jf.add(pp);

		jf.setSize(300, 200);
		jf.setVisible(true);

	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand() == "Numbers") {
			cd.show(pp, "Numbers");
		} else {
			cd.show(pp, "Alphabets");
		}

		if (ae.getActionCommand() == "D") {

			jf.remove(pp);
			jf.add(new Calculator());
			jf.revalidate();
			jf.repaint();

		}
	}
}

public class ui_4 {
	public static void main(String args[]) {
		new CardLayout1();
	}
}