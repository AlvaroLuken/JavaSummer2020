

public class Entity {
	
	private int id = 0;
	private String name = null;
	private int income = 0;
	public static final int DEFAULT_TAX_RATE = 25;
	
	private static int nextIdNumber=1;
	
	public Entity(String anyName) {
		
		this.name = anyName;
		this.id = nextIdNumber;
		
	}
	
	public Entity(String anyName, int anyIncome) {
		this(anyName);
		this.income = anyIncome;
		
	}
	
	public Entity() {
		
	}

	public int getId() {
		return this.id;
	}

	public void setId(int anyId) {
		this.id = anyId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String anyName) {
		this.name = anyName;
	}
	
	public static int getNextIdNumber() {
		return nextIdNumber;
	}
	
	
	
	

}
