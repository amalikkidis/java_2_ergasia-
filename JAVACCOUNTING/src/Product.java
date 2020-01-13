

import java.math.BigDecimal;
import java.util.HashMap;

public class Product {
	private String name; // Assumes names are unique
	private BigDecimal price;
	private Vat vat;

	public static HashMap<String, Product> productMap = new HashMap<String, Product>(); // Global map of product ids
																						// to Products

	public Product(String name, BigDecimal price, Vat vat) {
		super();
		this.name = name;
		this.price = price;
		this.price.setScale(2, BigDecimal.ROUND_HALF_EVEN); // Round up to two decimal points
		this.vat = vat;
	}

	public void addToProductMap() {
		productMap.put(this.name, this);
	}

	public static Product getProductByName(String name) {
		Product product = productMap.get(name);
		if (product == null) {
			throw new NullPointerException("Product not found");
		}
		return product;
	}

	public String getName() {
		return name;
	}

	public Vat getVat() {
		return vat;
	}

	public void setVat(Vat vat) {
		this.vat = vat;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPriceWithVat() {
		return price.multiply(vat.getValue().add(new BigDecimal("1")));
	}

}
