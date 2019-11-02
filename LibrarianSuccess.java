import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class LibrarianSuccess extends JFrame {
	static LibrarianSuccess frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LibrarianSuccess();
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
	public LibrarianSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 734);
		contentPane = new JPanel();
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblLibrarianSection = new JLabel("Librarian Section ");
		lblLibrarianSection.setFont(new Font("Tahoma", Font.PLAIN, 22));
		
		JButton btnNewButton = new JButton("Add Books");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			BooksForm.main(new String[]{});
			frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnViewBooks = new JButton("View Books");
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewBooks.main(new String[]{});
			}
		});
		btnViewBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBookForm.main(new String[]{});
				frame.dispose();
			}
		});
		btnIssueBook.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnViewIssuedBooks = new JButton("View Issued Books");
		btnViewIssuedBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewIssuedBooks.main(new String[]{});
			}
		});
		btnViewIssuedBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnBook.main(new String[]{});
				frame.dispose();
			}
		});
		btnReturnBook.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Library.main(new String[]{});
				frame.dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnDeleteBooks = new JButton("Delete Books");
		btnDeleteBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			  DeleteBook.main(new String[]{}); 
			  frame.dispose();
			}
		});
		btnDeleteBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnUpdateBooks = new JButton("Update Books");
		btnUpdateBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  UpdateBookFrom.main(new String[]{}); 
				  frame.dispose();
			}
		});
		btnUpdateBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnAddMember = new JButton("Add Member");
		btnAddMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				   MemberForm.main(new String[]{}); 
				  frame.dispose();
			
			}
		});
		btnAddMember.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnViewMember = new JButton("View Member");
		btnViewMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewMember.main(new String[]{}); 
				  
			}
		});
		btnViewMember.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnDeleteMember = new JButton("Delete Member");
		btnDeleteMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 DeleteMember.main(new String[]{}); 
				  frame.dispose();
			}
		});
		btnDeleteMember.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnUpdateMember = new JButton("Update Member");
		btnUpdateMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 UpdateMemberForm.main(new String[]{}); 
				  frame.dispose();
			}
		});
		btnUpdateMember.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(219)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(14, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(223, Short.MAX_VALUE)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(223, Short.MAX_VALUE)
					.addComponent(btnDeleteBooks, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(223, Short.MAX_VALUE)
					.addComponent(btnUpdateBooks, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(223, Short.MAX_VALUE)
					.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(223, Short.MAX_VALUE)
					.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(223, Short.MAX_VALUE)
					.addComponent(btnViewIssuedBooks, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(223, Short.MAX_VALUE)
					.addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(223, Short.MAX_VALUE)
					.addComponent(btnAddMember, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(223, Short.MAX_VALUE)
					.addComponent(btnViewMember, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(223, Short.MAX_VALUE)
					.addComponent(btnDeleteMember, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(201, Short.MAX_VALUE)
					.addComponent(lblLibrarianSection)
					.addGap(54))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(223, Short.MAX_VALUE)
					.addComponent(btnUpdateMember, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLibrarianSection)
					.addGap(18)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnDeleteBooks, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(btnUpdateBooks, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(btnViewIssuedBooks, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAddMember, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnViewMember, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnDeleteMember, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnUpdateMember, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
