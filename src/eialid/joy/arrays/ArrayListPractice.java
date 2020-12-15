package eialid.joy.arrays;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		
		arr1.add(10);
		arr1.add(30);
		//arr1.clear();
		System.out.println(arr1.isEmpty());
		System.out.println(arr1.size());
		System.out.println(arr1.remove(0));
		System.out.println(arr1);

	}

}
