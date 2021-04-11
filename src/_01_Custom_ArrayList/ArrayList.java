package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	public ArrayList() {
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		System.out.println(loc);
		return this.get(loc);
	}
	
	public void add(int loc) {
		System.out.println(loc);
		this.add(loc);
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		this.insert(loc, val);
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}