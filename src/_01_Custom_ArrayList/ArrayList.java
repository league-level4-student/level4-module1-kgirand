package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	public ArrayList() {
	}
	private T[] list = (T[])new Object[0];
	public T get(int loc) throws IndexOutOfBoundsException {
		return list[loc];
	}
	
	public void add(T val) {
		
		T[] newList = (T[])new Object[list.length+1];
		for(int i = 0; i < list.length; i++) {
			newList[i] = list[i];
		}
		newList[newList.length-1] = val;
		list = newList;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] newList = (T[])new Object[list.length+1];
		for(int i = 0; i < loc; i++) {
			newList[i] = list[i];
		}
		newList[loc]=val;
		for(int i = loc; i < list.length; i++) {
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
		for(int i = loc; i < list.length-1; i ++) {
			newList[i]=list[i+1];
		}
		
		list = newList;
	
	}
	public int size() {
		return list.length;
	}
	
	public boolean contains(T val) {
		for(int i = 0; i<list.length; i++) {
			if(list[i]==val) {
				return true; 
			}
		}
		return false;
	}
}