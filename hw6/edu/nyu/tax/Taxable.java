package edu.nyu.tax;
public interface Taxable {
	
	public TaxBracket getTaxRate();
	public double calculateTax();

}
