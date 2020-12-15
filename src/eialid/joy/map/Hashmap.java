package eialid.joy.map;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String, Integer> obj1= new HashMap<String, Integer>();
		
		obj1.put("eialid", 150);
		obj1.put("ASHRAF", 250);
		obj1.put("ROny", 100);
		obj1.put("Khalid", 500);
		
		System.out.print(obj1.containsKey("ASHRAF"));

	}

}
