import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UpdateMemberForm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	static UpdateMemberForm frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				 frame = new UpdateMemberForm();
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
	public UpdateMemberForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUpadteMemberDetails = new JLabel("Upadte Member Details");
		lblUpadteMemberDetails.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUpadteMemberDetails.setBounds(141, 32, 183, 22);
		contentPane.add(lblUpadteMemberDetails);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(98, 78, 46, 14);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(178, 75, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

	final	JLabel lblType_1 = new JLabel("type");
		lblType_1.setBounds(178, 216, 46, 14);
		contentPane.add(lblType_1);
	
		final	JComboBox comboBox = new JComboBox();
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 try{
						int id= Integer.parseInt( textField.getText())  ;  
						if(MemberDao.checkMember(id)){
						
					    Connection con=DB.getConnection();
						PreparedStatement ps=con.prepareStatement("select * from member where id=?");
						ps.setInt(1, id);
				                
						ResultSet rs=ps.executeQuery();
						if(rs.next()){
							textField_1.setText(rs.getString("name"));
				 			textField_2.setText(rs.getString("contact"));
				 			textField_3.setText(rs.getString("address"));
				 			lblType_1.setText(rs.getString("type"));
						
						}
						con.close();
						}
						else
						{
							 JOptionPane.showMessageDialog(UpdateMemberForm.this,"member not found!");
						}
					}catch(Exception e){System.out.println(e);}

			}
		});
		btnNewButton.setBounds(289, 74, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(98, 120, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblContactNo = new JLabel("Contact No");
		lblContactNo.setBounds(98, 156, 54, 14);
		contentPane.add(lblContactNo);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(98, 216, 46, 14);
		contentPane.add(lblType);
		
		JLabel lblAdress = new JLabel("address");
		lblAdress.setBounds(98, 191, 46, 14);
		contentPane.add(lblAdress);
		
		textField_1 = new JTextField();
		textField_1.setBounds(178, 117, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(178, 153, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(178, 188, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		

		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Student", "Teacher"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(291, 213, 64, 20);
		contentPane.add(comboBox);
		
		JButton btnUpadte = new JButton("Upadte");
		btnUpadte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			  int id= Integer.parseInt( textField.getText())  ;  
			 String name= textField_1.getText();
			 String contact= textField_2.getText();
			 String address= textField_3.getText();
			 String type=comboBox.getSelectedItem().toString(); 
             
			 int i=MemberDao.update(id, name, contact, address, type);  		
					if(i>0){
						JOptionPane.showMessageDialog(UpdateMemberForm.this,"Record update successfully!");
						LibrarianSuccess.main(new String[]{});
					 frame.dispose();
					
					}
						else
				    	JOptionPane.showMessageDialog(UpdateMemberForm.this,"Record not update successfully!");
			}
		});
		btnUpadte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnUpadte.setBounds(84, 241, 89, 23);
		contentPane.add(btnUpadte);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibrarianSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBack.setBounds(247, 241, 89, 23);
		contentPane.add(btnBack);
		
		
		

	}
}
