import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class MemberForm extends JFrame {
	static MemberForm frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new MemberForm();
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
	public MemberForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Add Member ");
		lblNewLabel.setBounds(149, 32, 107, 15);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(92, 79, 66, 15);
		
		JLabel lblNewLabel_2 = new JLabel("Contact No");
		lblNewLabel_2.setBounds(92, 121, 75, 15);
		
		JLabel lblNewLabel_3 = new JLabel("Address");
		lblNewLabel_3.setBounds(92, 162, 55, 15);
		
		JLabel lblNewLabel_4 = new JLabel("Type");
		lblNewLabel_4.setBounds(92, 189, 66, 15);
		
		textField = new JTextField();
		textField.setBounds(212, 77, 124, 19);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(212, 119, 124, 19);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(212, 160, 124, 19);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(259, 184, 84, 24);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Student", "Teacher"}));
		comboBox.setToolTipText("");
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(97, 233, 114, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	             String name=textField.getText();
	             String contact=textField_1.getText();
	             String address=textField_2.getText();
			     String type=comboBox.getSelectedItem().toString();
			   //  System.out.println(type);
			  int i=MemberDao.save(name, contact, address, type);           
			  if(i>0){
					JOptionPane.showMessageDialog(MemberForm.this,"Books added successfully!");
					LibrarianSuccess.main(new String[]{});
					frame.dispose();
				
				}else{
					JOptionPane.showMessageDialog(MemberForm.this,"Sorry, unable to save!");
				}
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(311, 220, 114, 25);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibrarianSuccess.main(new String[]{});
		        frame.dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblNewLabel_1);
		contentPane.add(lblNewLabel_2);
		contentPane.add(lblNewLabel_3);
		contentPane.add(lblNewLabel_4);
		contentPane.add(textField);
		contentPane.add(textField_1);
		contentPane.add(textField_2);
		contentPane.add(comboBox);
		contentPane.add(btnNewButton);
		contentPane.add(btnBack);
	}
}
