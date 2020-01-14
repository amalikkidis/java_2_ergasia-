

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
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
	private JComboBox comboBox_product;
	private JTextField final_price;
	private JLabel priceLabel;
	private JScrollPane scrollPane;
	private JPanel scrollPanePanel;
	private JLabel vat_label;
	private Invoice invoice;
	private JLabel invoice_icon; 
	private String input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new Product("Banana", new BigDecimal("0.14"), Vat.NONE).addToProductMap();
		new Product("Apple", new BigDecimal("0.08"), Vat.STANDARD).addToProductMap();
		new Product("Orange", new BigDecimal("0.06"), Vat.LOW).addToProductMap();
		new Product("Carrot", new BigDecimal("0.17"), Vat.LOW).addToProductMap();
		new Product("Broccoli", new BigDecimal("0.56"), Vat.LOW).addToProductMap();
		new Product("Lettuce", new BigDecimal("0.99"), Vat.LOW).addToProductMap();
		new Product("Pineapple", new BigDecimal("0.98"), Vat.STANDARD).addToProductMap();
		new Product("Grapes", new BigDecimal("0.54"), Vat.STANDARD).addToProductMap();
		new Product("Watermelon", new BigDecimal("0.69"), Vat.NONE).addToProductMap();
		InvoiceDialog frame = new InvoiceDialog(new Invoice());
		frame.setVisible(true);
		
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
		comboBox_product.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String comboBoxString = comboBox_product.getSelectedItem().toString();
				Product pro = Product.getProductByName(comboBoxString);
			String vat_string =	pro.getVat().getVatString();
			vat_label.setText(vat_string);
			String price_string = pro.getPrice().toString();
			priceLabel.setText(price_string);
			}
		});
		comboBox_product.setBounds(15, 192, 178, 36);
		itemsFieldPanel.add(comboBox_product);

		JLabel product_label = new JLabel("Product");
		product_label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		product_label.setBounds(15, 160, 66, 29);
		itemsFieldPanel.add(product_label);

		JLabel lblVat = new JLabel("VAT");
		lblVat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVat.setBounds(232, 180, 50, 20);
		itemsFieldPanel.add(lblVat);

		arithmos_tim = new JTextField();
		arithmos_tim.setBounds(13, 107, 128, 32);
		itemsFieldPanel.add(arithmos_tim);
		arithmos_tim.setColumns(10);

		JLabel lblInvoiceNumber = new JLabel("Invoice number");
		lblInvoiceNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInvoiceNumber.setBounds(15, 85, 126, 23);
		itemsFieldPanel.add(lblInvoiceNumber);

		JLabel Manufacturer_lbl = new JLabel("Manufacturer");
		Manufacturer_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Manufacturer_lbl.setBounds(352, 85, 126, 23);
		itemsFieldPanel.add(Manufacturer_lbl);

		paragogos = new JTextField();
		paragogos.setFont(new Font("Tahoma", Font.PLAIN, 10));
		paragogos.setBounds(353, 108, 136, 36);
		itemsFieldPanel.add(paragogos);
		paragogos.setColumns(10);

		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuantity.setBounds(518, 179, 126, 23);
		itemsFieldPanel.add(lblQuantity);

		posotita = new JTextField();
		posotita.setFont(new Font("Tahoma", Font.PLAIN, 10));
		posotita.setHorizontalAlignment(SwingConstants.RIGHT);
		posotita.setText("0");
		posotita.setColumns(10);
		posotita.setBounds(518, 199, 136, 36);
		itemsFieldPanel.add(posotita);

		JLabel TIN_lbl = new JLabel("SSN");
		TIN_lbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		TIN_lbl.setBounds(190, 85, 126, 23);
		itemsFieldPanel.add(TIN_lbl);

		afm = new JTextField();
		afm.setFont(new Font("Tahoma", Font.PLAIN, 10));
		afm.setHorizontalAlignment(SwingConstants.RIGHT);
		afm.setColumns(10);
		afm.setBounds(190, 107, 136, 32);
		itemsFieldPanel.add(afm);

		JLabel lblIssueDate = new JLabel("Issue date");
		lblIssueDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIssueDate.setBounds(518, 85, 126, 23);
		itemsFieldPanel.add(lblIssueDate);

		im_ekdosis = new JTextField();
		im_ekdosis.setFont(new Font("Tahoma", Font.PLAIN, 10));
		im_ekdosis.setColumns(10);
		im_ekdosis.setBounds(518, 108, 136, 36);
		itemsFieldPanel.add(im_ekdosis);

		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrice.setBounds(372, 179, 126, 23);
		itemsFieldPanel.add(lblPrice);

		table = new JTable();
		table.setBounds(53, 108, 1, 1);
		itemsFieldPanel.add(table);

		priceLabel = new JLabel("");
		priceLabel.setBounds(372, 199, 84, 29);
		itemsFieldPanel.add(priceLabel);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String comboBoxString = comboBox_product.getSelectedItem().toString();
				Product pro = Product.getProductByName(comboBoxString);
				String posotita_string = posotita.getText();
				Integer posotita_int = Integer.parseInt(posotita_string);
				Integer quantity = invoice.getItems().get(comboBoxString);
				
				if(quantity == null) {
					invoice.getItems().put(comboBoxString, posotita_int);
				}
				else {
					quantity += posotita_int;
					invoice.getItems().put(comboBoxString, quantity);
					
				}
				drawCart();
				final_price.setText(invoice.getTotalPrice().toString());
			}
		});
		btnAdd.setBounds(753, 126, 115, 50);
		itemsFieldPanel.add(btnAdd);
		
		vat_label = new JLabel("");
		vat_label.setBounds(232, 208, 69, 20);
		itemsFieldPanel.add(vat_label);
		
	    invoice_icon = new JLabel("");
	    Image image1 = new ImageIcon(this.getClass().getResource("invoice-icon.png")).getImage();
		invoice_icon.setIcon(new ImageIcon(image1));
		invoice_icon.setBounds(15, 0, 84, 75);
		itemsFieldPanel.add(invoice_icon);
		

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
				String invoice_num = arithmos_tim.getText();
				Integer invoice_Num = Integer.parseInt(invoice_num);
				String ssn = afm.getText();
				String imerominia_ek = im_ekdosis.getText();
				String paragogos_s = paragogos.getText();
				invoice.setInvoiceNumber(invoice_Num);
				invoice.setSsn(ssn);
				invoice.setIssueDate(imerominia_ek);
				invoice.setManufacturer(paragogos_s);
				Invoice.store(invoice);
				MainMenu b = new MainMenu();
				b.setVisible(true);
				dispose();
			}
		});
		btnSaveExit.setBounds(470, 481, 115, 43);
		panel.add(btnSaveExit);
		
		JButton btnCheckHistory = new JButton("Check History");
		btnCheckHistory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 input = JOptionPane.showInputDialog("Please enter Invoice number:");
			 Integer input_i = Integer.parseInt(input);
			 Invoice invoice = Invoice.getByNumber(input_i);
			 if(invoice == null) {
				 JOptionPane.showMessageDialog(getParent(),"The Invoice number you have entered does not exist.");
			 }
			 else {
				 InvoiceDialog i  = new InvoiceDialog(invoice);
				 i.setVisible(true);
			 }
			}
		});
		btnCheckHistory.setBounds(47, 482, 148, 42);
		panel.add(btnCheckHistory);
	}

	public InvoiceDialog(Invoice invoice) {
		this();
		this.arithmos_tim.setText("" + invoice.getInvoiceNumber());
		this.afm.setText(invoice.getSsn());
		this.paragogos.setText(invoice.getManufacturer());
		this.im_ekdosis.setText(invoice.getIssueDate().toString());
		this.final_price.setText(invoice.getTotalValue().toString());
		this.invoice = invoice;

		String productName = String.valueOf(comboBox_product.getSelectedItem());
		Product product = Product.getProductByName(productName);
		this.priceLabel.setText(product.getPrice().toString());
		this.posotita.setText("10");
		drawCart();
	}
	
	public void drawCart() {
		scrollPanePanel.removeAll();
		for (String productName : invoice.getItems().keySet()) {
			Integer quantity = invoice.getItems().get(productName);
			Product product = Product.getProductByName(productName);
			scrollPanePanel.add(new ProductJpanel(product, quantity));
		}
		scrollPanePanel.revalidate();
		final_price.setText(invoice.getTotalPrice().toString());
	}
}
