
package assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class customer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfname;
	private JTextField tlname;
	private JTextField tadd;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String fname,lname,cname,address,dob,gender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					customer frame = new customer();
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
	public customer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCustomerDetails = new JLabel("Customer Details");
		lblCustomerDetails.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblCustomerDetails.setBounds(10, 20, 249, 37);
		contentPane.add(lblCustomerDetails);
		
		JLabel lblNewLabel_1 = new JLabel("First Name: ");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 97, 127, 25);
		contentPane.add(lblNewLabel_1);
		
		tfname = new JTextField();
		tfname.setColumns(10);
		tfname.setBounds(184, 85, 352, 37);
		contentPane.add(tfname);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name: ");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 159, 127, 25);
		contentPane.add(lblNewLabel_1_1);
		
		tlname = new JTextField();
		tlname.setColumns(10);
		tlname.setBounds(184, 147, 352, 37);
		contentPane.add(tlname);
		
		JLabel lblNewLabel_1_2 = new JLabel("Date of Birth: ");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_2.setBounds(10, 219, 127, 25);
		contentPane.add(lblNewLabel_1_2);
		
		JComboBox cbdate = new JComboBox();
		cbdate.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cbdate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cbdate.setBounds(184, 213, 55, 37);
		contentPane.add(cbdate);
		
		JComboBox cbmonth = new JComboBox();
		cbmonth.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		cbmonth.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cbmonth.setBounds(292, 215, 137, 37);
		contentPane.add(cbmonth);
		
		JComboBox cbyear = new JComboBox();
		cbyear.setModel(new DefaultComboBoxModel(new String[] {"1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024"}));
		cbyear.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cbyear.setBounds(486, 215, 100, 37);
		contentPane.add(cbyear);
		
		JLabel lblNewLabel_1_3 = new JLabel("Gender: ");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_3.setBounds(10, 283, 127, 25);
		contentPane.add(lblNewLabel_1_3);
		
		JRadioButton rb1 = new JRadioButton("Male");
		rb1.setSelected(true);
		buttonGroup.add(rb1);
		rb1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rb1.setBounds(184, 279, 137, 37);
		contentPane.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Female");
		buttonGroup.add(rb2);
		rb2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rb2.setBounds(367, 283, 137, 37);
		contentPane.add(rb2);
		
		JLabel lblNewLabel_1_4 = new JLabel("Address: ");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1_4.setBounds(10, 348, 127, 25);
		contentPane.add(lblNewLabel_1_4);
		
		tadd = new JTextField();
		tadd.setColumns(10);
		tadd.setBounds(184, 353, 352, 73);
		contentPane.add(tadd);
		
		JButton bt1 = new JButton("Submit");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fname=tfname.getText();
				lname=tlname.getText();
				cname=fname+" "+lname;
				System.out.println(cname);
				address=tadd.getText();
				if(rb1.isSelected()) {
					gender=rb1.getText();
				}
				if(rb2.isSelected()) {
					gender=rb2.getText();
				}
				dob=cbdate.getSelectedItem().toString()+" "+cbmonth.getSelectedItem().toString()+" "+cbyear.getSelectedItem().toString();
				System.out.println(dob);
				JOptionPane.showMessageDialog(null, "Select a Car");
				car carFrame = new car();
				carFrame.setVisible(true);
				carFrame.customerData.setText("Customer Name: "+cname+"\nDate of Birth: "+dob+"\nGender: "+gender+"\nAddress: "+address);
			}
		});
		bt1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		bt1.setBounds(44, 475, 156, 37);
		contentPane.add(bt1);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfname.setText(null);
				tlname.setText(null);
				tadd.setText(null);
				rb1.setSelected(false);
				rb2.setSelected(false);
				
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnClear.setBounds(250, 475, 156, 37);
		contentPane.add(btnClear);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		btnCancel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnCancel.setBounds(458, 475, 156, 37);
		contentPane.add(btnCancel);
	}

}
