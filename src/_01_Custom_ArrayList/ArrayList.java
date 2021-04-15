package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	public ArrayList() {
	}
	private T[] list = (T[])new Object[0];
	public T get(int loc) throws IndexOutOfBoundsException {
		return list[loc];
	}
	
	public void add(int loc,T val) {
		
		T[] newList = (T[])new Object[list.length+1];
		for(int i = 0; i < loc; i++) {
			newList[i] = list[i];
		}
		newList[newList.length-1] = val;
		list = newList;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] newList = (T[])new Object[list.length+1];
		for(int i = 0; i < loc; i++) {
			newList[i+1] = list[i];
		}
		list = newList;
		}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		list[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] newList = (T[])new Object[list.length-1];
		for(int i = 0; i < loc; i++) {
			newList[i] = list[i];
		}
		
		list = newList;
	
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}