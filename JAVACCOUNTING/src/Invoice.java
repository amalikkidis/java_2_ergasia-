

import java.math.BigDecimal; // gia na min xanoume se akriveia stis times twn proiontwn otan kanoume prakseis
import java.util.Date;
import java.util.HashMap;

public class Invoice {
	private int invoiceNumber; 
	private String ssn, manufacturer;
	private String issueDate; 
	private BigDecimal totalValue; //sunoliki aksia olou tou timologio (times + vat)
	private HashMap<String, Integer> cart; // MapQ product name (monadiko key) to quantity(value) (kalathi agorwn me polla proionta)
	private Vat vat; 
	
	private static HashMap<Integer, Invoice> invoices = new HashMap<Integer, Invoice>(); // Map: invoice number (key) to the whole Invoice object(value)

	public Invoice(int invoiceNumber, String ssn, String manufacturer, String issueDate, Vat vat, BigDecimal totalValue,
			HashMap<String, Integer> cart) { //Constructor pou ftiaxnei ena invoice me times pou orizoyme otan ton kaloume
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
	
	public Invoice() {  //constructor pou ftiaxnei invoice me arxikopoihmenes times
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

	public HashMap<String, Integer> getItems() { //epistrefei to kalathi twn agorwn mas (product name + quantity)
		return cart;
	}

	public void setItems(HashMap<String, Integer> cart) { //kanei set to kalathi twn agorwn mas
		this.cart = cart; 
	}
	
	public BigDecimal getTotalPrice() { //ypologizei thn synoliki timi olwn twn proiontwn mesa sto cart
		BigDecimal totalValue = new BigDecimal("0.0");
		for (String productName : cart.keySet()) { //prospelasi se ola ta key tou kart
			Product product = Product.getProductByName(productName);
			totalValue = totalValue.add(product.getPriceWithVat().multiply(new BigDecimal(cart.get(productName)))); // multiplies totalValue(value+vat) * quantity
		}
		return totalValue;
	}
	
	public static void store(Invoice invoice) { //apothikeuei proswrina to invoice
		invoices.put(invoice.getInvoiceNumber(), invoice);
	}
	
	public static Invoice getByNumber(int invoiceNumber) { //kanei get to invoice me vasi to invoice number
		return invoices.get(invoiceNumber);
	}

}
