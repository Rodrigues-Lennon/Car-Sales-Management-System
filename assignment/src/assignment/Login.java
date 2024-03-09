package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private JTextField tuname;
	private JPasswordField tpwd;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 660, 462);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(10, 23, 199, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 97, 127, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		tuname = new JTextField();
		tuname.setColumns(10);
		tuname.setBounds(175, 91, 267, 37);
		frame.getContentPane().add(tuname);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 186, 127, 25);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		tpwd = new JPasswordField();
		tpwd.setBounds(175, 174, 267, 37);
		frame.getContentPane().add(tpwd);
		
		JButton btlogin = new JButton("Login");
		btlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uname=tuname.getText();
				String pwd=tpwd.getText();
				
				if(uname.equals("abc")&&pwd.equals("123")) {
					JOptionPane.showMessageDialog(null, "Successful Login");
					salesman SaleFrame=new salesman();
					SaleFrame.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
					tuname.setText(null);
					tpwd.setText(null);
				}
			}
		});
		btlogin.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btlogin.setBounds(30, 346, 156, 37);
		frame.getContentPane().add(btlogin);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tuname.setText(null);
				tpwd.setText(null);
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnClear.setBounds(236, 346, 156, 37);
		frame.getContentPane().add(btnClear);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCancel.setBounds(444, 346, 156, 37);
		frame.getContentPane().add(btnCancel);
	}
}
