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


public class DeleteBook extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	static DeleteBook frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new DeleteBook();
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
	public DeleteBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteBook = new JLabel("Delete Book");
		lblDeleteBook.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDeleteBook.setBounds(163, 43, 78, 19);
		contentPane.add(lblDeleteBook);
		
		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setBounds(80, 97, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(165, 94, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			  int id=Integer.parseInt(textField.getText());
			  int ch=BookDao.checkBook(id);
			  if(ch==1)
			  {
				  int de= BookDao.delete(id);
				  if(de>0)
				  {
					  JOptionPane.showMessageDialog(DeleteBook.this," deleted successfully!");
						LibrarianSuccess.main(new String[]{});
						frame.dispose();
				  }
				  else
				  {
					  JOptionPane.showMessageDialog(DeleteBook.this," deleted not successfully!");
				  }
			  }
			  else
			  {
				  JOptionPane.showMessageDialog(DeleteBook.this," record not found!");
			  }
			}
		});
		btnNewButton.setBounds(78, 148, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(254, 148, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
