package eialid.joy.stack;

public class Main {

	public static void main(String[] args) {
		DynamicStack obj=new DynamicStack();
		
		obj.push(13);
		obj.push(23);
		obj.push(12);
		obj.push(14);
		obj.push(14);
		obj.pop();
		obj.pop();
		obj.pop();

		//System.out.println(obj.peek());
		//System.out.println(obj.size());
		
		
		obj.show();
		
		
		
	}

}
