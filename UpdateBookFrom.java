import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class UpdateBookFrom extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JButton btnSubmit;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateBookFrom frame = new UpdateBookFrom();
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
	public UpdateBookFrom() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUpdateBookForm = new JLabel("Update Book Form");
		lblUpdateBookForm.setBounds(157, 26, 126, 15);
		contentPane.add(lblUpdateBookForm);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(109, 53, 66, 15);
		contentPane.add(lblNewLabel);
		
		name = new JTextField();
		name.setBounds(219, 51, 124, 19);
		contentPane.add(name);
		name.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(219, 94, 124, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(219, 140, 124, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(219, 192, 124, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(219, 227, 124, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    int status=0;
				try {
			    	 Connection con=DB.getConnection();
			 	//	int id1=Integer.parseInt(textField.getText());
			 		PreparedStatement ps=con.prepareStatement("select * from books where id=?");
			 		
			 		ps.setString(1,name.getText());
			 	    
			 		ResultSet rs=ps.executeQuery();
			 		if(rs.next()){
			 			textField_1.setText(rs.getString("callNo"));
			 			textField_2.setText(rs.getString("name"));
			 			textField_3.setText(rs.getString("author"));
			 			textField_4.setText(rs.getString("publisher"));
			 			textField_5.setText(rs.getString("quantity"));
			 			textField_6.setText(rs.getString("issued"));
			 			textField_7.setText(rs.getString("added_date"));
			 			//textField_8.setText(rs.getString("author"));
			 		}
			 		
			 		
			 		
			 	//	status=ps2.executeUpdate();
			 		con.close();	
				}
			 	
			     
			     
			     catch(Exception e)
			     {
			    	 
			     }
			
			
			
			}
		});
		btnNewButton.setBounds(341, 48, 114, 25);
		contentPane.add(btnNewButton);
		
		textField_5 = new JTextField();
		textField_5.setBounds(219, 263, 124, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(219, 296, 124, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(219, 327, 124, 19);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(109, 96, 66, 15);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(109, 142, 66, 15);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(109, 181, 66, 15);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(109, 229, 66, 15);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setBounds(109, 265, 66, 15);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(109, 298, 66, 15);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setBounds(109, 329, 66, 15);
		contentPane.add(lblNewLabel_7);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(98, 371, 114, 25);
		contentPane.add(btnSubmit);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(258, 371, 114, 25);
		contentPane.add(btnBack);
	}

}
