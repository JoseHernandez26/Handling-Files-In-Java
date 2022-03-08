package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BookWindow {

	public JFrame frame;
	public JTextField textField;
	public JTextField textField_1;
	public JTextField textField_2;
	public JTextField textField_3;
	
	
	 JButton btnNewButton = new JButton("INSERT BOOK"); //Add a book to a list 
	
	JButton btnDisplayBooks = new JButton("DISPLAY BOOKS"); // Botton to display books on list

	JButton btnSaveBooks = new JButton("SAVE"); // books to save books on a file
	
	JButton btnRestore = new JButton("RESTORE "); // botton to restore the file with a list of books with their details
	
private	JButton btnExit = new JButton("EXIT"); //exit
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookWindow window = new BookWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	
	public BookWindow() {
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

	public JButton getBtnDisplayBooks() {
		return btnDisplayBooks;
	}

	public void setBtnDisplayBooks(JButton btnDisplayBooks) {
		this.btnDisplayBooks = btnDisplayBooks;
	}

	public JButton getBtnSaveBooks() {
		return btnSaveBooks;
	}

	public void setBtnSaveBooks(JButton btnSaveBooks) {
		this.btnSaveBooks = btnSaveBooks;
	}

	public JButton getBtnRestore() {
		return btnRestore;
	}

	public void setBtnRestore(JButton btnRestore) {
		this.btnRestore = btnRestore;
	}

	public JButton getBtnExit() {
		return btnExit;
	}

	public void setBtnExit(JButton btnExit) {
		this.btnExit = btnExit;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1014, 376);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Details");
		lblNewLabel.setForeground(new Color(0, 139, 139));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(381, 24, 425, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number of publication");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 94, 189, 22);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(228, 80, 119, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Title");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 156, 189, 22);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Amount of pages");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(409, 94, 189, 22);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Price");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(409, 156, 189, 22);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(117, 144, 230, 38);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBounds(608, 75, 162, 43);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(571, 144, 199, 36);
		frame.getContentPane().add(textField_3);
	
		btnNewButton.setBackground(new Color(0, 128, 128));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 254, 174, 38);
		frame.getContentPane().add(btnNewButton);
		
		
		btnDisplayBooks.setForeground(Color.WHITE);
		btnDisplayBooks.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDisplayBooks.setBackground(new Color(0, 128, 128));
		btnDisplayBooks.setBounds(209, 254, 174, 38);
		frame.getContentPane().add(btnDisplayBooks);
		
		btnSaveBooks.setForeground(Color.WHITE);
		btnSaveBooks.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSaveBooks.setBackground(new Color(0, 128, 128));
		btnSaveBooks.setBounds(409, 254, 174, 38);
		frame.getContentPane().add(btnSaveBooks);
		
		
		btnRestore.setForeground(Color.WHITE);
		btnRestore.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRestore.setBackground(new Color(0, 128, 128));
		btnRestore.setBounds(609, 254, 174, 38);
		frame.getContentPane().add(btnRestore);
		
		
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnExit.setBackground(new Color(0, 128, 128));
		btnExit.setBounds(814, 254, 174, 38);
		frame.getContentPane().add(btnExit);
		
		frame.setVisible(true);
	}
}
