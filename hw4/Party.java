

public abstract class Party {
	
	public int id = 0;
	private String name = null;
	private int income = 0;
	
	private static int nextId = 1;
	
	public Party(String anyName) {
		this.name = anyName;
		this.id = nextId++;
	}
	
	public abstract double getTaxAmount();
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String anyName) {
		this.name = anyName;
	}
	
	public int getIncome() {
		return this.income;
	}
	
	public void setIncome(int anyIncome) {
		this.income = anyIncome;
	}
	
	public static int getNextId() {
		return nextId;
	}
	
	public Party() {
		
	}
}
