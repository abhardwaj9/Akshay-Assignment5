package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			items = biggerBackupArray();
		}
		items[size] = item;
		size++;
		return true;
	}
	
	private Object[] biggerBackupArray() {
		Object[] bigArray = new Object[size*2];
		for(int i=0; i<size; i++) {
			bigArray[i] = items[i];
		}
		return bigArray;
	}
	@Override
	public int getSize() {
		
		return this.size;
	}

	@Override
	public T get(int index) {
		
		if(index < this.size) {
			return (T) items[index];
		}
		return null;
	}
	
}
