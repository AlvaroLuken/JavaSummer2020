
public abstract class Person extends Entity {
	
	private int income = 0;
	private TaxBracket taxRate = TaxBracket.Zero;
	
	public Person() {
		
	}
	
	public TaxBracket getTaxRate() {
		return this.taxRate;
	}
	
	public double calculateTax() {
		return this.income * taxRate.getValue()/100;
	}
	
	
	
	public int getIncome() {
		return this.income;
	}
	
	public void setIncome(int anyIncome) {
		this.income = anyIncome;
		if(income <= 0) {
			this.taxRate = taxRate.Zero;
		} else if (income < 30000) {
			this.taxRate = taxRate.Low;
		} else if (income >= 30000 && income < 60000) {
			this.taxRate = taxRate.Medium;
		} else if (income >= 60000 && income < 100000) {
			this.taxRate = taxRate.High;
		} else {
			this.taxRate = taxRate.Highest;
		}
		
	}

}
