package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	private T[] list;
	
	
	public ArrayList() {
		list = (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return list[loc];
	}
	
	public void add(T val) {
		T[] temp = (T[])new Object[list.length + 1];
		for (int i = 0; i < list.length; i++) {
			temp[i] = list[i];
		}
		temp[list.length] = val;
		list = temp;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
		T[] temp = (T[])new Object[list.length + 1];
		int counte = -1;
		boolean useCounte = false;
		
		for (int i = 0; i < temp.length; i++) {
			
			if (i == loc) 
			{
				temp[i] = val;
				useCounte = true;
			}
			else 
			{
				if (useCounte) 
				{
					temp[i] = list[counte];
				}
				else 
				{
					temp[i] = list[i];
				}
			}
			
			counte = counte + 1;
		}
		list = temp;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		list[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
		T[] temp = (T[])new Object[list.length - 1];
		int counte = 1;
		boolean useCounte = false;
		
		for (int i = 0; i < temp.length; i++) {
			
			if (i == loc) 
			{
				useCounte = true;
			}
			
			if (useCounte) 
			{
				temp[i] = list[counte];
			}
			else 
			{
				temp[i] = list[i];
			}
			
			counte = counte + 1;
		}
		list = temp;
	}
	
	public boolean contains(T val) {
		
		for (int i = 0; i < list.length; i++) {
			if (list[i] == val) 
			{
				return true;
			}
		}
		
		return false;
	}
	
	public int size() {
		
		return list.length;
	}
}