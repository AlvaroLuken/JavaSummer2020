

public class Person extends Entity {
	
	private int tax_rate = 0;
	
	public Person(String anyName) {
		super(anyName);
		this.tax_rate = DEFAULT_TAX_RATE;
	}
	
	public Person(String anyName, int anyTaxRate) {
		super(anyName);
		this.tax_rate = anyTaxRate;
	}
	
	public Person(String anyName, int anyTaxRate, int anyIncome) {
		super(anyName, anyIncome);
		this.tax_rate = anyTaxRate;
	}

	public int getTax_rate() {
		return tax_rate;
	}

	public void setTax_rate(int anyTaxRate) {
		this.tax_rate = anyTaxRate;
	}
	

}
