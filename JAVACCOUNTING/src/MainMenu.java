 

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MainMenu extends JFrame {

	private JPanel contentPane;
	private JLabel bs_icon;
	private JLabel is_icon;
	private JLabel i_icon;
	
	

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
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 864, 538);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton balance_sheed = new JButton("Balance Sheet");
		balance_sheed.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 17));
		balance_sheed.setBackground(new Color(255, 250, 205));
		balance_sheed.setBounds(340, 72, 180, 46);
		contentPane.add(balance_sheed);
		
		JButton btnIncomeStatement = new JButton("Income Statement");
		btnIncomeStatement.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 17));
		btnIncomeStatement.setBackground(new Color(255, 250, 205));
		btnIncomeStatement.setBounds(340, 203, 180, 46);
		contentPane.add(btnIncomeStatement);
		
		JButton btnInvoice = new JButton("Invoice");
		btnInvoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InvoiceDialog d = new InvoiceDialog();
				d.setVisible(true);
				
			}
		});
		btnInvoice.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 17));
		btnInvoice.setBackground(new Color(255, 250, 205));
		btnInvoice.setBounds(340, 334, 180, 46);
		contentPane.add(btnInvoice);
		
		JButton logout_btn = new JButton("Log out");
		logout_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Invoice_start_page e = new Invoice_start_page();
				e.setVisible(true);
				dispose();
				
			}
		});
		logout_btn.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 13));
		logout_btn.setBounds(644, 418, 119, 39);
		contentPane.add(logout_btn);
		
		bs_icon = new JLabel("");
		Image image1 = new ImageIcon(this.getClass().getResource("dollar-folder-icon.png")).getImage();
		bs_icon.setIcon(new ImageIcon(image1));
		bs_icon.setBounds(109, 53, 94, 86);
		contentPane.add(bs_icon);
		
		is_icon = new JLabel("");
		Image image2 = new ImageIcon(this.getClass().getResource("coin-us-dollar-icon.png")).getImage();
		is_icon.setIcon(new ImageIcon(image2));
		is_icon.setBounds(109, 171, 94, 92);
		contentPane.add(is_icon);
		
		i_icon = new JLabel("");
		Image image3 = new ImageIcon(this.getClass().getResource("Cash-register-icon.png")).getImage();
		i_icon.setIcon(new ImageIcon(image3));
		i_icon.setBounds(109, 314, 94, 86);
		contentPane.add(i_icon);
	}
}

