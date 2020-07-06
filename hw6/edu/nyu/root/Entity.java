package edu.nyu.root;
import edu.nyu.tax.Taxable;

public abstract class Entity implements Taxable {
	public int id;
	
	private static int nextId = 1;
	
	public Entity() {
		id = nextId++;
	}
}
