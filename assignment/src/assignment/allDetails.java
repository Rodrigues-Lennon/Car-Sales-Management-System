package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class allDetails extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextArea CarDetails;
	public JTextArea CustomerDetails;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					allDetails frame = new allDetails();
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
	public allDetails() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 558);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		CustomerDetails = new JTextArea();
		CustomerDetails.setBounds(316, 76, 320, 340);
		contentPane.add(CustomerDetails);
		
		CarDetails = new JTextArea();
		CarDetails.setBounds(10, 76, 320, 340);
		contentPane.add(CarDetails);
		
		JButton btnDone = new JButton("Done");
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Car Purchase Successful");
				System.exit(ABORT);
			}
		});
		btnDone.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDone.setBounds(234, 456, 156, 37);
		contentPane.add(btnDone);
		
		JLabel lblInvoice = new JLabel("   Invoice");
		lblInvoice.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblInvoice.setBounds(10, 10, 249, 37);
		contentPane.add(lblInvoice);
	}
}
