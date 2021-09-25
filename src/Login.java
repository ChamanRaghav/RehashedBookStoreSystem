
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

	private JPanel panel;
	private JTextField textField;
	private JPasswordField passwordField;
    private JButton b1,b2,b3;

    
	public static void main(String[] args) {
		System.out.print("Boom Application started!!! hurrey!");
		new Login().setVisible(true);
	}


	public Login() {
	    super("Login");
	    
		setBackground(new Color(169, 169, 169));	
		setBounds(600, 300, 600, 400);
			
	    panel = new JPanel();
		panel.setBackground(new Color(176, 224, 230));
		setContentPane(panel);
		panel.setLayout(null);
	
		JLabel l1 = new JLabel("Username : ");
		l1.setBounds(124, 89, 95, 24);
		panel.add(l1);
	
		JLabel l2 = new JLabel("Password : ");
		l2.setBounds(124, 124, 95, 24);
		panel.add(l2);
	
		textField = new JTextField();
		textField.setBounds(210, 93, 157, 20);
		panel.add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(210, 128, 157, 20);
		panel.add(passwordField);
	
		JLabel l3 = new JLabel("");
		l3.setBounds(377, 79, 46, 34);
		panel.add(l3);
	
		JLabel l4 = new JLabel("");
		l4.setBounds(377, 124, 46, 34);
		panel.add(l3);
	
		b1 = new JButton("Login");
	                
		b1.setForeground(new Color(46, 139, 87));
		b1.setBackground(new Color(250, 250, 210));
		b1.setBounds(149, 181, 113, 39);
		b1.addActionListener(this);
		panel.add(b1);
			
	    b2 = new JButton("Sign Up");
		
		b2.setForeground(new Color(139, 69, 19));
		b2.setBackground(new Color(255, 235, 205));
		b2.setBounds(289, 181, 113, 39);
		b2.addActionListener(this);
		panel.add(b2);
	
		b3 = new JButton("Forgot Password");
		
	    b3.setForeground(new Color(205, 92, 92));
		b3.setBackground(new Color(253, 245, 230));
		b3.setBounds(199, 231, 179, 39);
		panel.add(b3);

		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(176, 224, 230));
		panel2.setBounds(24, 40, 434, 263);
		panel.add(panel2);
	}
        

	public void actionPerformed(ActionEvent ae){
        try{
            
            if(ae.getSource() == b1){
            	this.setVisible(false);
        		new Signup().setVisible(true);
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
                new Signup().setVisible(true);
            }
        }catch(Exception e){
            
        }
    }
}
