package swingexample;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame extends JFrame {
	Container c;
	JButton b1, b2, b3, b4, b5;
	MyFrame(){
		setSize(600,400);
		this.setLocationRelativeTo(null);
		c=this.getContentPane();
//		c.setLayout(new FlowLayout());
		//c.setLayout(new BorderLayout());
		c.setLayout(new GridLayout(2,3));
		b1=new JButton("Button 1");
		b2=new JButton("Button 2");
		b3=new JButton("Button 3");
		b4=new JButton("Button 4");
		b5=new JButton("Button 5");
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
//		c.add(b1,BorderLayout.NORTH);
//		c.add(b2,BorderLayout.SOUTH);
//		c.add(b3,BorderLayout.CENTER);
//		c.add(b4,BorderLayout.WEST);
//		c.add(b5,BorderLayout.EAST);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class LayoutExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             new MyFrame();
	}

}
