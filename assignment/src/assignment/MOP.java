package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class MOP extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MOP frame = new MOP();
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
	public MOP() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSalesmanDetails = new JLabel("Mode Of Payment");
		lblSalesmanDetails.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblSalesmanDetails.setBounds(10, 10, 249, 37);
		contentPane.add(lblSalesmanDetails);
		
		JTextArea salesmenDetails = new JTextArea();
		salesmenDetails.setEditable(false);
		salesmenDetails.setBounds(27, 74, 568, 178);
		contentPane.add(salesmenDetails);
		
		JButton purchase = new JButton("Proceed to Pay");
		purchase.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		purchase.setBounds(67, 394, 275, 37);
		contentPane.add(purchase);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCancel.setBounds(423, 394, 156, 37);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_1_3 = new JLabel("Choose Mode of Payment:");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(27, 312, 249, 25);
		contentPane.add(lblNewLabel_1_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cash", "Cheque", "Net Banking", "UPI", "Debit Card", "Credit Card"}));
		comboBox.setBounds(346, 300, 249, 37);
		contentPane.add(comboBox);
	}

}
