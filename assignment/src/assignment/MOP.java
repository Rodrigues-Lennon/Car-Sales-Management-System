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
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class MOP extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextArea carData;
	public String CarData;
	public JTextArea customerdata;
	public String CustomerData;
	public String modePay;

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
	
	public int RandomNum() {
		Random rand = new Random();
		
		int upperbound=9999999;
		int longRandom=rand.nextInt(upperbound);
		return longRandom;
		
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
		
		carData = new JTextArea();
		carData.setEditable(false);
		carData.setBounds(27, 74, 568, 178);
		contentPane.add(carData);
		
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCancel.setBounds(423, 394, 156, 37);
		contentPane.add(btnCancel);
		
		JLabel lblNewLabel_1_3 = new JLabel("Choose Mode of Payment:");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(27, 312, 249, 25);
		contentPane.add(lblNewLabel_1_3);
		
		JComboBox ModePay = new JComboBox();
		ModePay.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ModePay.setModel(new DefaultComboBoxModel(new String[] {"Cash", "Cheque", "Net Banking", "UPI", "Debit Card", "Credit Card"}));
		ModePay.setBounds(346, 300, 249, 37);
		contentPane.add(ModePay);
		
		customerdata = new JTextArea();
		customerdata.setBounds(299, 22, 56, 22);
		contentPane.add(customerdata);
		customerdata.setVisible(false);
		
		JButton purchase = new JButton("Proceed to Pay");
		purchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				CarData=carData.getText();
				System.out.println(CarData);
				CustomerData=customerdata.getText();
				modePay=ModePay.getSelectedItem().toString();
				
				allDetails finalPage = new allDetails();
				finalPage.setVisible(true);
				finalPage.CarDetails.setText("Car Details\n"+CarData+"\nSold By: Sam D'Cruz (Junior Salesmen)");
				finalPage.CustomerDetails.setText("Customer Details \n"+CustomerData+"\n\nTransaction Details\nMode of Payment: "+modePay+"\nTransaction ID: "+RandomNum());
				
			}
		});
		purchase.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		purchase.setBounds(67, 394, 275, 37);
		contentPane.add(purchase);
		
	}
}
