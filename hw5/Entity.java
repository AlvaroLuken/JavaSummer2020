
public abstract class Entity implements Taxable {
	public int id;
	
	private static int nextId = 1;
	
	public Entity() {
		id = nextId++;
	}
}
