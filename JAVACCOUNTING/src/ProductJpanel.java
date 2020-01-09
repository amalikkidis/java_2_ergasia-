package src;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;

public class ProductJpanel extends JPanel {
	
	private JLabel productLBL;

	/**
	 * Create the panel.
	 */
	public ProductJpanel() {
		setLayout(null);
		productLBL = new JLabel("product");
		productLBL.setBounds(42, 69, 69, 20);
		add(productLBL);
		
		JLabel productName = new JLabel("");
		productName.setBackground(new Color(60, 179, 113));
		productName.setBounds(126, 69, 122, 20);
		add(productName);
		
		JLabel priceLBL = new JLabel("price");
		priceLBL.setBounds(301, 69, 69, 20);
		add(priceLBL);
		
		JLabel priceName = new JLabel("");
		priceName.setForeground(new Color(60, 179, 113));
		priceName.setBackground(new Color(0, 0, 0));
		priceName.setBounds(385, 69, 112, 20);
		add(priceName);
		
		JLabel VATlbl = new JLabel("VAT");
		VATlbl.setBounds(543, 69, 69, 20);
		add(VATlbl);
		
		JLabel VAT_amount = new JLabel("");
		VAT_amount.setBounds(627, 69, 97, 20);
		add(VAT_amount);

	}
	
	public ProductJpanel(Product product) {
		this();
	}
}
