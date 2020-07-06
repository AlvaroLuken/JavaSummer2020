package edu.nyu.tax;
public enum TaxBracket {
	Zero(0), Low(10), Medium(20), High(30), Highest(40);
	private int value;
	
	private TaxBracket(int anyValue) {
		this.value = anyValue;
	}
	
	public int getValue() {
		return this.value;
	}
	

}
