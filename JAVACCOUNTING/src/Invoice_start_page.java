package src;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Invoice_start_page {

	private JFrame frame; // to connect message window with parent login frame
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getUsername() {
		return username;
	}

	public void setUsername(JTextField username) {
		this.username = username;
	}

	private JTextField username;
	private JTextField password;

	/*
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Invoice_start_page window = new Invoice_start_page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*
	 * Create the application.
	 */
	public Invoice_start_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 826, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		// login
		JButton btnNewButton = new JButton("login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usern = username.getText();
				String passw = password.getText();
				
				if(usern.equals("jdoe") && passw.equals("1111")) {
					JOptionPane.showMessageDialog(frame, "You have succesfully loged in");
					/**
					 * link 1st Jframe with second Jframe, code row 61,62
					 * first_invoice_frame first_iframe = new first_invoice_frame();
					 * first_iframe.setVisible(true);
					 */
				}
				else {
					JOptionPane.showMessageDialog(frame, "Invalid username or password");
				}
			}
		});
		btnNewButton.setBounds(344, 332, 150, 54);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblUsername = new JLabel("     username");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUsername.setBounds(115, 118, 123, 32);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("     password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPassword.setBounds(115, 189, 131, 32);
		frame.getContentPane().add(lblPassword);
		
		username = new JTextField();
		username.setBounds(287, 125, 116, 22);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JTextField();
		password.setBounds(287, 196, 116, 22);
		frame.getContentPane().add(password);
		password.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Please login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(344, 39, 150, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblHelpUsername = new JLabel("Help : username -> jdoe   password ->  1111");
		lblHelpUsername.setBounds(115, 277, 277, 16);
		frame.getContentPane().add(lblHelpUsername);
	}

	
}
