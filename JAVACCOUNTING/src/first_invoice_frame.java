import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.UIManager;

public class first_invoice_frame extends JFrame {

	private JPanel contentPane;
	private JTextField arithmos_tim;
	private JTextField paragogos;
	private JTextField posotita;
	private JTextField afm;
	private JTextField im_ekdosis;
	private JTextField price;
	private JTable table;
	private JComboBox VAT_combobox;
	private JTextField final_price;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					first_invoice_frame frame = new first_invoice_frame();
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
	public first_invoice_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1026, 669);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane menuLayeredPane = new JLayeredPane();
		menuLayeredPane.setBounds(10, 11, 990, 57);
		contentPane.add(menuLayeredPane);
		
		JLayeredPane workSpaceLayeredPane = new JLayeredPane();
		workSpaceLayeredPane.setBounds(10, 66, 990, 578);
		contentPane.add(workSpaceLayeredPane);
		workSpaceLayeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		workSpaceLayeredPane.add(panel, "name_2435266846600");
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 244, 990, 206);
		panel.add(scrollPane);
		
		JLayeredPane invoiceItemLayeredPane = new JLayeredPane();
		invoiceItemLayeredPane.setBounds(0, 0, 990, 244);
		panel.add(invoiceItemLayeredPane);
		invoiceItemLayeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel itemsFieldPanel = new JPanel();
		invoiceItemLayeredPane.add(itemsFieldPanel, "name_22954513041800");
		itemsFieldPanel.setLayout(null);
		
		JComboBox comboBox_product = new JComboBox();
		comboBox_product.setBounds(113, 174, 178, 36);
		itemsFieldPanel.add(comboBox_product);
		
		JLabel product_label = new JLabel("Product");
		product_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		product_label.setBounds(113, 147, 66, 29);
		itemsFieldPanel.add(product_label);
		
		JLabel lblVat = new JLabel("VAT");
		lblVat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVat.setBounds(400, 151, 50, 20);
		itemsFieldPanel.add(lblVat);
		
		arithmos_tim = new JTextField();
		arithmos_tim.setBounds(113, 80, 128, 37);
		itemsFieldPanel.add(arithmos_tim);
		arithmos_tim.setColumns(10);
		
		VAT_combobox = new JComboBox();
		VAT_combobox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		VAT_combobox.setBounds(400, 174, 66, 36);
		itemsFieldPanel.add(VAT_combobox);
		VAT_combobox.addItem("0");
		VAT_combobox.addItem("5");
		VAT_combobox.addItem("12");
		VAT_combobox.addItem("18");
		VAT_combobox.addItem("24");
		
		
		
		JLabel lblInvoiceNumber = new JLabel("Invoice number");
		lblInvoiceNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInvoiceNumber.setBounds(113, 57, 126, 23);
		itemsFieldPanel.add(lblInvoiceNumber);
		
		JLabel Manufacturer_lbl = new JLabel("Manufacturer");
		Manufacturer_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Manufacturer_lbl.setBounds(631, 57, 126, 23);
		itemsFieldPanel.add(Manufacturer_lbl);
		
		paragogos = new JTextField();
		paragogos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		paragogos.setBounds(631, 81, 136, 36);
		itemsFieldPanel.add(paragogos);
		paragogos.setColumns(10);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuantity.setBounds(834, 150, 126, 23);
		itemsFieldPanel.add(lblQuantity);
		
		posotita = new JTextField();
		posotita.setFont(new Font("Tahoma", Font.PLAIN, 10));
		posotita.setHorizontalAlignment(SwingConstants.RIGHT);
		posotita.setText("0");
		posotita.setColumns(10);
		posotita.setBounds(834, 175, 136, 36);
		itemsFieldPanel.add(posotita);
		
		JLabel TIN_lbl = new JLabel("ΤΙΝ");
		TIN_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TIN_lbl.setBounds(400, 57, 126, 23);
		itemsFieldPanel.add(TIN_lbl);
		
		afm = new JTextField();
		afm.setFont(new Font("Tahoma", Font.PLAIN, 10));
		afm.setHorizontalAlignment(SwingConstants.RIGHT);
		afm.setColumns(10);
		afm.setBounds(400, 81, 136, 36);
		itemsFieldPanel.add(afm);
		
		JLabel lblIssueDate = new JLabel("Issue date");
		lblIssueDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIssueDate.setBounds(834, 57, 126, 23);
		itemsFieldPanel.add(lblIssueDate);
		
		im_ekdosis = new JTextField();
		im_ekdosis.setFont(new Font("Tahoma", Font.PLAIN, 10));
		im_ekdosis.setColumns(10);
		im_ekdosis.setBounds(834, 81, 136, 36);
		itemsFieldPanel.add(im_ekdosis);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrice.setBounds(631, 150, 126, 23);
		itemsFieldPanel.add(lblPrice);
		
		price = new JTextField();
		price.setFont(new Font("Tahoma", Font.PLAIN, 10));
		price.setHorizontalAlignment(SwingConstants.RIGHT);
		price.setText("0");
		price.setColumns(10);
		price.setBounds(631, 175, 136, 36);
		itemsFieldPanel.add(price);
		
		table = new JTable();
		table.setBounds(53, 108, 1, 1);
		itemsFieldPanel.add(table);
		
		JLabel total_v_lbl = new JLabel("Total value");
		total_v_lbl.setBounds(724, 474, 56, 16);
		panel.add(total_v_lbl);
		
		final_price = new JTextField();
		final_price.setBounds(810, 471, 116, 22);
		panel.add(final_price);
		final_price.setColumns(10);
	}
}
