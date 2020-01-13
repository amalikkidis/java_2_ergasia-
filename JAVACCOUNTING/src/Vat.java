

import java.math.BigDecimal;

public enum Vat {
    STANDARD(new BigDecimal("0.24")),
    LOW(new BigDecimal("0.13")),
    NONE(new BigDecimal("0.00"));

    private final BigDecimal value;

    Vat(BigDecimal val) {
        value = val;
    }

    public BigDecimal getValue() {
        return value;
    }
    
    public String getVatString() {
    	return getValue().multiply(new BigDecimal(100)).toString() + "%";
    }
}
