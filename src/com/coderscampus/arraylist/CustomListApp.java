package com.coderscampus.arraylist;

public class CustomListApp {

	public static void main(String[] args) {
		
		System.out.println("Custom List App");
		CustomList<Integer> numberList = new CustomArrayList<>();
		
		for (int i = 0; i<=50; i++) {
			numberList.add(i);	
		}
		System.out.println("---------------");
		for (int count = 0; count < numberList.getSize(); count++) {
			System.out.println(numberList.get(count));
		}
	}

}
