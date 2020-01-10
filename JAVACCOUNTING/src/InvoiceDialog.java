package src;

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
import java.math.BigDecimal;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.ScrollPaneConstants;
import java.awt.Dimension;

public class InvoiceDialog extends JFrame {

	private JPanel contentPane;
	private JTextField arithmos_tim;
	private JTextField paragogos;
	private JTextField posotita;
	private JTextField afm;
	private JTextField im_ekdosis;
	private JTable table;
	private JComboBox VAT_combobox;
	private JComboBox comboBox_product;
	private JTextField final_price;
	private JLabel priceLabel;
	private JScrollPane scrollPane;
	private JPanel scrollPanePanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Product("Banana", new BigDecimal("0.14"), Vat.NONE).addToProductMap();
		new Product("Apple", new BigDecimal("0.08"), Vat.STANDARD).addToProductMap();
		new Product("Orange", new BigDecimal("0.06"), Vat.LOW).addToProductMap();
		InvoiceDialog frame = new InvoiceDialog(new Invoice());
		frame.setVisible(true);
		Invoice_start_page obj = new Invoice_start_page();
	}

	/**
	 * Create the frame.
	 */
	public InvoiceDialog() {
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

		scrollPane = new JScrollPane();
		scrollPane.getViewport().setPreferredSize(new Dimension(990, 250));
		scrollPane.setBounds(10, 260, 968, 206);
		panel.add(scrollPane);

		scrollPanePanel = new JPanel();
		scrollPane.setViewportView(scrollPanePanel);
		scrollPane.revalidate();
		scrollPanePanel.setLayout(new BoxLayout(scrollPanePanel, BoxLayout.Y_AXIS));

		JLayeredPane invoiceItemLayeredPane = new JLayeredPane();
		invoiceItemLayeredPane.setBounds(0, 0, 990, 244);
		panel.add(invoiceItemLayeredPane);
		invoiceItemLayeredPane.setLayout(new CardLayout(0, 0));

		JPanel itemsFieldPanel = new JPanel();
		invoiceItemLayeredPane.add(itemsFieldPanel, "name_22954513041800");
		itemsFieldPanel.setLayout(null);

		comboBox_product = new JComboBox(Product.productMap.keySet().toArray());
		comboBox_product.setBounds(15, 172, 178, 36);
		itemsFieldPanel.add(comboBox_product);

		JLabel product_label = new JLabel("Product");
		product_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		product_label.setBounds(15, 147, 66, 29);
		itemsFieldPanel.add(product_label);

		JLabel lblVat = new JLabel("VAT");
		lblVat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVat.setBounds(232, 151, 50, 20);
		itemsFieldPanel.add(lblVat);

		arithmos_tim = new JTextField();
		arithmos_tim.setBounds(15, 78, 128, 37);
		itemsFieldPanel.add(arithmos_tim);
		arithmos_tim.setColumns(10);

		VAT_combobox = new JComboBox();
		VAT_combobox.setModel(new DefaultComboBoxModel(Vat.values()));
		VAT_combobox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		VAT_combobox.setBounds(232, 174, 84, 36);
		itemsFieldPanel.add(VAT_combobox);

		JLabel lblInvoiceNumber = new JLabel("Invoice number");
		lblInvoiceNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInvoiceNumber.setBounds(15, 57, 126, 23);
		itemsFieldPanel.add(lblInvoiceNumber);

		JLabel Manufacturer_lbl = new JLabel("Manufacturer");
		Manufacturer_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Manufacturer_lbl.setBounds(343, 57, 126, 23);
		itemsFieldPanel.add(Manufacturer_lbl);

		paragogos = new JTextField();
		paragogos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		paragogos.setBounds(343, 81, 136, 36);
		itemsFieldPanel.add(paragogos);
		paragogos.setColumns(10);

		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuantity.setBounds(518, 150, 126, 23);
		itemsFieldPanel.add(lblQuantity);

		posotita = new JTextField();
		posotita.setFont(new Font("Tahoma", Font.PLAIN, 10));
		posotita.setHorizontalAlignment(SwingConstants.RIGHT);
		posotita.setText("0");
		posotita.setColumns(10);
		posotita.setBounds(518, 175, 136, 36);
		itemsFieldPanel.add(posotita);

		JLabel TIN_lbl = new JLabel("SSN");
		TIN_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TIN_lbl.setBounds(180, 57, 126, 23);
		itemsFieldPanel.add(TIN_lbl);

		afm = new JTextField();
		afm.setFont(new Font("Tahoma", Font.PLAIN, 10));
		afm.setHorizontalAlignment(SwingConstants.RIGHT);
		afm.setColumns(10);
		afm.setBounds(180, 81, 136, 36);
		itemsFieldPanel.add(afm);

		JLabel lblIssueDate = new JLabel("Issue date");
		lblIssueDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIssueDate.setBounds(518, 57, 126, 23);
		itemsFieldPanel.add(lblIssueDate);

		im_ekdosis = new JTextField();
		im_ekdosis.setFont(new Font("Tahoma", Font.PLAIN, 10));
		im_ekdosis.setColumns(10);
		im_ekdosis.setBounds(518, 81, 136, 36);
		itemsFieldPanel.add(im_ekdosis);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrice.setBounds(385, 150, 126, 23);
		itemsFieldPanel.add(lblPrice);

		table = new JTable();
		table.setBounds(53, 108, 1, 1);
		itemsFieldPanel.add(table);

		priceLabel = new JLabel("");
		priceLabel.setBounds(385, 172, 84, 36);
		itemsFieldPanel.add(priceLabel);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String comboBoxString = comboBox_product.getSelectedItem().toString();
				System.out.println(comboBoxString);
				scrollPanePanel.add(new ProductJpanel(new Product("Inna Innaki DVD", new BigDecimal("9.99"), Vat.LOW), 10));
				scrollPanePanel.revalidate();
			}
		});
		btnAdd.setBounds(753, 126, 115, 50);
		itemsFieldPanel.add(btnAdd);

		JLabel total_v_lbl = new JLabel("Total value");
		total_v_lbl.setBounds(679, 474, 116, 16);
		panel.add(total_v_lbl);

		final_price = new JTextField();
		final_price.setBounds(810, 471, 116, 22);
		panel.add(final_price);
		final_price.setColumns(10);
		
		JButton btnSaveExit = new JButton("Save & Exit");
		btnSaveExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Invoice_start_page b = new Invoice_start_page();
				b.getFrame().setVisible(true);
				dispose();
			}
		});
		btnSaveExit.setBounds(470, 481, 115, 43);
		panel.add(btnSaveExit);
	}

	public InvoiceDialog(Invoice invoice) {
		this();
		this.arithmos_tim.setText("" + invoice.getInvoiceNumber());
		this.afm.setText(invoice.getSsn());
		this.paragogos.setText(invoice.getManufacturer());
		this.im_ekdosis.setText(invoice.getIssueDate().toString());
		this.final_price.setText(invoice.getTotalValue().toString());
		this.VAT_combobox.setSelectedItem(invoice.getVat());

		String productName = String.valueOf(comboBox_product.getSelectedItem());
		Product product = Product.getProductByName(productName);
		this.priceLabel.setText(product.getPrice().toString());
		this.posotita.setText(invoice.getItems().get(productName).toString());
	}
}
