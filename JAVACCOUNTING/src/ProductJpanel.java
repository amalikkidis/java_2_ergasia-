

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.math.BigDecimal;

public class ProductJpanel extends JPanel {
	
	private JLabel productLBL;
	private JLabel productName;
	private JLabel priceLBL;
	private JLabel priceName;
	private JLabel VATlbl;
	private JLabel VAT_amount;
	private JLabel lblQuantity;
	private JLabel quantity_amount;
	private JLabel lblFinalPrice;
	private JLabel fprice_output;
	

	/**
	 * Create the panel.
	 */
	public ProductJpanel() {
		setPreferredSize(new Dimension(950, 49));
		setBackground(Color.CYAN);
		setLayout(null);
		productLBL = new JLabel("product");
		productLBL.setBounds(15, 16, 69, 20);
		add(productLBL);
		
		 productName = new JLabel("");
		productName.setBackground(new Color(60, 179, 113));
		productName.setBounds(99, 16, 104, 20);
		add(productName);
		
		priceLBL = new JLabel("price");
		priceLBL.setBounds(218, 16, 41, 20);
		add(priceLBL);
		
		priceName = new JLabel("");
		priceName.setForeground(new Color(60, 179, 113));
		priceName.setBackground(new Color(0, 0, 0));
		priceName.setBounds(274, 16, 83, 20);
		add(priceName);
		
		VATlbl = new JLabel("VAT");
		VATlbl.setBounds(372, 16, 41, 20);
		add(VATlbl);
		
		VAT_amount = new JLabel("");
		VAT_amount.setBounds(428, 16, 69, 20);
		add(VAT_amount);
		
		lblQuantity = new JLabel("Quantity");
		lblQuantity.setBounds(512, 16, 60, 20);
		add(lblQuantity);
		
		quantity_amount = new JLabel("");
		quantity_amount.setBounds(587, 16, 69, 20);
		add(quantity_amount);
		
		lblFinalPrice = new JLabel("Final price:");
		lblFinalPrice.setBounds(671, 16, 88, 20);
		add(lblFinalPrice);
		
		fprice_output = new JLabel("");
		fprice_output.setBounds(774, 16, 69, 20);
		add(fprice_output);

	}
	
	public ProductJpanel(Product product, Integer quantity) {
		this();
		this.productName.setText(product.getName());
		this.priceName.setText(product.getPrice().toString());
		this.quantity_amount.setText(quantity.toString());
		this.VAT_amount.setText(product.getVat().getVatString());
		this.fprice_output.setText(product.getPriceWithVat().multiply(new BigDecimal(quantity)).toString());
		
		
	}
}
