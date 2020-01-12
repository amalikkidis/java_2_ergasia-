package src;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Window;

public class MainMenu extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 538);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 179, 113));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton balance_sheed = new JButton("Balance Sheed");
		balance_sheed.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 17));
		balance_sheed.setBackground(new Color(138, 43, 226));
		balance_sheed.setBounds(340, 72, 180, 46);
		contentPane.add(balance_sheed);
		
		JButton btnIncomeStatement = new JButton("Income Statement");
		btnIncomeStatement.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 17));
		btnIncomeStatement.setBackground(new Color(138, 43, 226));
		btnIncomeStatement.setBounds(340, 203, 180, 46);
		contentPane.add(btnIncomeStatement);
		
		JButton btnInvoice = new JButton("Invoice");
		btnInvoice.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 17));
		btnInvoice.setBackground(new Color(138, 43, 226));
		btnInvoice.setBounds(340, 334, 180, 46);
		contentPane.add(btnInvoice);
		
		JButton logout_btn = new JButton("Log out");
		logout_btn.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		logout_btn.setBounds(644, 418, 119, 39);
		contentPane.add(logout_btn);
	}
}

