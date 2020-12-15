package eialid.joy.lists;

public class Main {

	public static void main(String[] args) {
		LinkedLists lists=new LinkedLists();
		
		lists.addLast(10);
		lists.addLast(20);
		lists.addLast(30);
		lists.addLast(40);
		lists.addLast(70);
		lists.addLast(50);
		//lists.removeFirst();
		lists.removeLast();
		//System.out.println(lists.indexOf(50));
		//System.out.println(lists.contains(200));
	}

}
