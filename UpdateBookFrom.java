import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnSubmit;
	private JButton btnBack;
	 static UpdateBookFrom frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new UpdateBookFrom();
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
		
		JLabel lblNewLabel = new JLabel("Id");
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
			 			
			 			//textField_8.setText(rs.getString("author"));
			 		}
			 		else
			 		{
			 			JOptionPane.showMessageDialog(UpdateBookFrom.this,"Record not found!");
			 		
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
		
		lblNewLabel_1 = new JLabel("CallNO");
		lblNewLabel_1.setBounds(109, 96, 66, 15);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(109, 142, 66, 15);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("author");
		lblNewLabel_3.setBounds(109, 181, 66, 15);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("publisher");
		lblNewLabel_4.setBounds(109, 229, 66, 15);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("qunatity");
		lblNewLabel_5.setBounds(109, 265, 66, 15);
		contentPane.add(lblNewLabel_5);
		
		btnSubmit = new JButton("Update");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int  id=Integer.parseInt(name.getText());
				String callno=textField_1.getText();
				String names=textField_2.getText();
				String author=textField_3.getText();
				String publisher=textField_4.getText();
				String quantity=textField_5.getText();
			 int ch= BookDao.update(id, callno, names, author, publisher, quantity);
			 if(ch>0)
			      {
				 JOptionPane.showMessageDialog(UpdateBookFrom.this,"book updated successfully!");
				 LibrarianSuccess.main(new String[]{});
				 frame.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(UpdateBookFrom.this,"book not updated successfully!");
			}
			
			}
		});
		btnSubmit.setBounds(113, 324, 114, 25);
		contentPane.add(btnSubmit);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibrarianSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setBounds(268, 324, 114, 25);
		contentPane.add(btnBack);
	}

}
