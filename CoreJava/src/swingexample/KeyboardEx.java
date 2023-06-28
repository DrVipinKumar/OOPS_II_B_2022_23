package swingexample;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
class MouseHandling extends MouseAdapter {
	JTextArea text;
	   MouseHandling(JTextArea text){
		   this.text=text;
	   }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		text.setText(text.getText()+"\nmouse Clicked");
	}

//	@Override
//	public void mousePressed(MouseEvent e) {
//		// TODO Auto-generated method stub
//		text.setText(text.getText()+"\nmouse Pressed");
//	}
//
//	@Override
//	public void mouseReleased(MouseEvent e) {
//		// TODO Auto-generated method stub
//		text.setText(text.getText()+"\nmouse Released");
//	}

//	@Override
//	public void mouseEntered(MouseEvent e) {
//		// TODO Auto-generated method stub
//		text.setText(text.getText()+"\nmouse Entered");
//	}
//
//	@Override
//	public void mouseExited(MouseEvent e) {
//		// TODO Auto-generated method stub
//		text.setText(text.getText()+"\nmouse Exited");
//	}
//	
}
class KeyHandling implements KeyListener{
  JTextArea text;
   KeyHandling(JTextArea text){
	   this.text=text;
   }
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		text.setText(text.getText()+"\nKey Typed=="+e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		text.setText(text.getText()+"\nKey Pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		text.setText(text.getText()+"\nKey Released");
	}
	
}
class KeyFrame extends JFrame {
	Container c;
	JTextArea text;
	Font font;
	JButton click;
	KeyFrame(){
		setSize(600,400);
		this.setLocationRelativeTo(null);
		c=this.getContentPane();
		c.setLayout(null);	
		font =new Font("arial",Font.BOLD,20);
		text=new JTextArea();
		text.setBounds(20, 20, 400, 300);		
		c.add(text);
		click=new JButton("Click on ME");
		click.setBounds(430, 100, 150, 40);
		click.addMouseListener(new MouseHandling(text));
		c.add(click);
	
		text.addKeyListener(new KeyHandling(text));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class KeyboardEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            new KeyFrame();
	} 

}
