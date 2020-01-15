

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
    
    public String getVatString() { //metatrepei to vat apo dekadiko se string %, px to 0.23 to kanei "23.00%" 
    	return getValue().multiply(new BigDecimal(100)).toString() + "%";
    }
}
