package swingexample;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
class CheckLogin implements ActionListener {
	JTextField user,pass;
	CheckLogin(JTextField user,JTextField pass){
		this.user=user;
		this.pass=pass;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(user.getText().equalsIgnoreCase("kiet") && 
				pass.getText().equalsIgnoreCase("mca")) {
			JOptionPane.showMessageDialog(null,"Welcome to Java Swing");
		} else {
			JOptionPane.showMessageDialog(null,"Try again!");
		}
	}
}
class Login extends JFrame {
	JLabel lblUser,lblPass;
	JTextField txtUser, txtPass;
	JButton btnLogin;
	Container c;
	Font font;
	ImageIcon icon;
	Login(){
		setSize(600,400);
		this.setLocationRelativeTo(null);
		c=this.getContentPane();
		c.setLayout(null);		
		icon =new ImageIcon("src/swingexample/hd.png");
		this.setIconImage(icon.getImage());
		font =new Font("Arial",Font.BOLD,15);
		lblUser =new JLabel("Username:");
		lblUser.setBounds(100, 100, 100, 20);
		lblUser.setFont(font);
		c.add(lblUser);
		lblPass =new JLabel("Password:");
		lblPass.setBounds(100, 150, 100, 20);
		lblPass.setFont(font);
		c.add(lblPass);
		txtUser =new JTextField();
		txtUser.setBounds(200, 100, 200, 30);
		txtUser.setFont(font);
		c.add(txtUser);
		txtPass =new JTextField();
		txtPass.setBounds(200, 150, 200, 30);
		txtPass.setFont(font);
		c.add(txtPass);
		btnLogin =new JButton("Login");
		btnLogin.setBounds(260, 200, 100, 30);
		btnLogin.setFont(font);
		btnLogin.addActionListener(new CheckLogin(txtUser,txtPass));
		c.add(btnLogin);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
public class LoginEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new Login();
	}

}
