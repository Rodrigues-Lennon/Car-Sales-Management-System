package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class salesman extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					salesman frame = new salesman();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public salesman() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSalesmanDetails = new JLabel("Salesman Details");
		lblSalesmanDetails.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblSalesmanDetails.setBounds(10, 31, 249, 37);
		contentPane.add(lblSalesmanDetails);
		
		JTextArea salesmenDetails = new JTextArea();
		salesmenDetails.setText("Name: Sam D'Cruz\n\nDate of Birth: 16 March 1989\n\nSalary: RS 25000\n\nPosition: Junior Salesman\n\nDate of Joining: 24 July 2010\n\n");
		salesmenDetails.setEditable(false);
		salesmenDetails.setBounds(27, 95, 568, 178);
		contentPane.add(salesmenDetails);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCancel.setBounds(439, 346, 156, 37);
		contentPane.add(btnCancel);
		
		JButton purchase = new JButton("Proceed Purchase of Car");
		purchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Enter Customer Details");
				customer customerFrame = new customer();
				customerFrame.setVisible(true);
			}
		});
		purchase.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		purchase.setBounds(83, 346, 275, 37);
		contentPane.add(purchase);
	}
}
