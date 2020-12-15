package eialid.joy.arrays;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Array numbers=new Array(3);
		numbers.insert(10);
		numbers.insert(20);
		numbers.insert(30);
		numbers.insert(40);
		//numbers.removeAt(0);
		int indexValue=numbers.indexOf(40);
		System.out.println("index value of 40 is : " + indexValue);
		numbers.print();
		
		
	}

}
