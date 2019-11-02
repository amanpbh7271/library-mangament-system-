import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteMember extends JFrame {

	private JPanel contentPane;
    static	DeleteMember frame;
    private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new DeleteMember();
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
	public DeleteMember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteMemebr = new JLabel("Delete memebr ");
		lblDeleteMemebr.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDeleteMemebr.setBounds(126, 31, 97, 32);
		contentPane.add(lblDeleteMemebr);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(87, 88, 46, 14);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(170, 85, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			int i=Integer.parseInt(textField.getText())   ;
			 if(MemberDao.checkMember(i))
			 {
				 int ch=MemberDao.delete(i);
				 if(ch>0)
				 {
					 JOptionPane.showMessageDialog(DeleteMember.this,"member deleted successfully!");
					 LibrarianSuccess.main(new String[]{});
					 frame.dispose();
				 }
				 else
				 {
					 JOptionPane.showMessageDialog(DeleteMember.this,"member not deleted successfully!");
				 }
			 }
			 else
			 {
				 JOptionPane.showMessageDialog(DeleteMember.this,"member not found");
			 }
			}
		});
		btnNewButton.setBounds(89, 154, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibrarianSuccess.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setBounds(226, 154, 89, 23);
		contentPane.add(btnBack);
	    
	
	}
}
