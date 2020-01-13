

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;

public class Invoice {
	private int invoiceNumber;
	private String ssn, manufacturer;
	private String issueDate;
	private BigDecimal totalValue;
	private HashMap<String, Integer> cart; // Map product name (should be unique) to quantity
	private Vat vat;
	
	private static HashMap<Integer, Invoice> invoices = new HashMap<Integer, Invoice>(); // Map invoice number to the whole Invoice object

	public Invoice(int invoiceNumber, String ssn, String manufacturer, String issueDate, Vat vat, BigDecimal totalValue,
			HashMap<String, Integer> cart) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.ssn = ssn;
		this.manufacturer = manufacturer;
		this.issueDate = issueDate;
		this.vat = vat;
		this.totalValue.setScale(2, BigDecimal.ROUND_HALF_EVEN); // Round up to two decimal points
		this.totalValue = totalValue;
		this.cart = cart;
	}
	
	public Invoice() {
		this.invoiceNumber = 0;
		this.ssn = "Enter SSN";
		this.manufacturer = "Enter Manufacturer";
		this.issueDate = new Date().toString();
		this.vat = Vat.LOW;
		this.totalValue = new BigDecimal("0.0");
		this.totalValue.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		this.cart = new HashMap<String, Integer>();
	}

	public int getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(int invoice_number) {
		this.invoiceNumber = invoice_number;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public BigDecimal getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}

	public Vat getVat() {
		return vat;
	}

	public void setVat(Vat vat) {
		this.vat = vat;
	}

	public HashMap<String, Integer> getItems() {
		return cart;
	}

	public void setItems(HashMap<String, Integer> cart) {
		this.cart = cart;
	}
	
	public BigDecimal getTotalPrice() {
		BigDecimal totalValue = new BigDecimal("0.0");
		for (String productName : cart.keySet()) {
			Product product = Product.getProductByName(productName);
			totalValue = totalValue.add(product.getPriceWithVat().multiply(new BigDecimal(cart.get(productName))));
		}
		return totalValue;
	}
	
	public static void store(Invoice invoice) {
		invoices.put(invoice.getInvoiceNumber(), invoice);
	}
	
	public static Invoice getByNumber(int invoiceNumber) {
		return invoices.get(invoiceNumber);
	}

}
