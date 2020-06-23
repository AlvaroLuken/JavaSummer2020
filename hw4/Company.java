
public class Company extends Party {
	
	private double taxRate = 0;
	public final static int LOW_TAX_RATE = 30;
	public final static int HIGH_TAX_RATE = 40;
	
	
	public Company(String anyName) {
		super(anyName);
	}
	
	@Override
	public double getTaxAmount() {
		double d1 = HIGH_TAX_RATE;
		double d2 = LOW_TAX_RATE;
		if(super.getIncome() > 200000) {
			this.taxRate = d1;
			return Company.LOW_TAX_RATE;
		} else {
			this.taxRate = d2;
			return this.taxRate;
		}
		
	}
	

}
