
public class Person extends Party {
	
	public static final int TAX_RATE = 25;

	public Person(String anyName) {
		super(anyName);
	}
	
	@Override
	public double getTaxAmount() {
		return Person.TAX_RATE;
	}

	
}
