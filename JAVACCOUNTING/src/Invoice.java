package src;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;

public class Invoice {
	private int invoiceNumber;
	private String ssn, manufacturer;
	private Date issueDate;
	private BigDecimal totalValue;
	private HashMap<String, Integer> cart; // Map product name (should be unique) to quantity
	private Vat vat;

	public Invoice(int invoiceNumber, String ssn, String manufacturer, Date issueDate, Vat vat, BigDecimal totalValue,
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
		this.issueDate = new Date();
		this.vat = Vat.LOW;
		this.totalValue = new BigDecimal("0.0");
		this.totalValue.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		this.cart = new HashMap<String, Integer>();
		this.cart.put("Orange", 30);
		this.cart.put("Apple", 10);
		this.cart.put("Banana", 5);
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

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
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

}
