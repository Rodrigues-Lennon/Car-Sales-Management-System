package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class car extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextArea customerData;
	public String CustomerData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					car frame = new car();
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
	public car() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCustomerDetails = new JLabel("Customer Details");
		lblCustomerDetails.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblCustomerDetails.setBounds(10, 10, 249, 37);
		contentPane.add(lblCustomerDetails);
		
		JLabel lblNewLabel_1 = new JLabel("Make:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 87, 127, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Model:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 149, 127, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Fuel Type:");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(10, 209, 127, 25);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Engine:");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(10, 273, 127, 25);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Mileage");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(10, 338, 127, 25);
		contentPane.add(lblNewLabel_1_4);
		
		
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(ABORT);
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCancel.setBounds(458, 465, 156, 37);
		contentPane.add(btnCancel);
		
		JComboBox cbfuel = new JComboBox();
		cbfuel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cbfuel.setModel(new DefaultComboBoxModel(new String[] {"Petrol", "Diesel", "Hybrid", "Electric", "CNG (Compressed Natural Gas)", "LPG (Liquefied Petroleum Gas)", "Hydrogen", "Flex Fuel (E85)", "Biodiesel", "Plug-in Hybrid"}));
		cbfuel.setBounds(192, 197, 207, 37);
		contentPane.add(cbfuel);
		
		JComboBox cbengine = new JComboBox();
		cbengine.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cbengine.setModel(new DefaultComboBoxModel(new String[] {"Inline-4", "V6", "V8", "Hybrid", "Electric", "Turbocharged", "Supercharged", "Rotary", "Boxer", "Diesel"}));
		cbengine.setBounds(192, 261, 207, 37);
		contentPane.add(cbengine);
		
		JComboBox cbmodel = new JComboBox();
		cbmodel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cbmodel.setModel(new DefaultComboBoxModel(new String[] {"Corolla", "Civic", "Focus", "Malibu", "3 Series", "C-Class", "Golf", "A4", "Altima", "Sonata"}));
		cbmodel.setBounds(192, 137, 207, 37);
		contentPane.add(cbmodel);
		
		JComboBox cbmake = new JComboBox();
		cbmake.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cbmake.setModel(new DefaultComboBoxModel(new String[] {"Toyota", "Honda", "Ford", "Chevrolet", "BMW", "Mercedes-Benz", "Volkswagen", "Audi", "Nissan", "Hyundai"}));
		cbmake.setBounds(192, 75, 207, 37);
		contentPane.add(cbmake);
		
		JComboBox cbmilage = new JComboBox();
		cbmilage.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cbmilage.setModel(new DefaultComboBoxModel(new String[] {"Less than 20 MPG", "20-30 MPG", "30-40 MPG", "40-50 MPG", "50-60 MPG", "60-70 MPG", "70-80 MPG", "80-90 MPG", "90-100 MPG", "More than 100 MPG"}));
		cbmilage.setBounds(192, 326, 207, 37);
		contentPane.add(cbmilage);
		JButton bt1 = new JButton("Submit");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String model=cbmodel.getSelectedItem().toString();
				String make=cbmake.getSelectedItem().toString();
				String fuel=cbfuel.getSelectedItem().toString();
				String mileage=cbmilage.getSelectedItem().toString();
				String engine=cbengine.getSelectedItem().toString();
				
				JOptionPane.showMessageDialog(null, "Confirm Order by Payment");
				MOP mop = new MOP();
				mop.setVisible(true);
				CustomerData=customerData.getText();
				System.out.println(CustomerData);
				mop.carData.setText("Make: "+make+"\nModel: "+model+"\nFuel Type: "+fuel+"\nMileage"+mileage+"\nEngine: "+engine);
				mop.customerdata.setText(CustomerData);
			}
		});
		bt1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		bt1.setBounds(44, 465, 156, 37);
		contentPane.add(bt1);
		
		customerData = new JTextArea();
		customerData.setBounds(178, 387, 127, 22);
		contentPane.add(customerData);
		customerData.setVisible(false);
		
	}
}
