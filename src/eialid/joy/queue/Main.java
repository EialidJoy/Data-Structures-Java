package eialid.joy.queue;

public class Main {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.enqueue(12);
		q.enqueue(13);
		q.enqueue(14);
		q.enqueue(24);
		q.enqueue(25);
		
		System.out.println("dequed value 1 is " + q.deque()) ;
		System.out.println("dequed value 2 is " + q.deque()) ;
		System.out.println("dequed value 3 is " + q.deque()) ;
		System.out.println("dequed value 4 is " + q.deque()) ;
		
		System.out.println("The size of the queue is " + q.geSize()) ;
		System.out.println("queue is empty : " + q.isEmpty());
		
		System.out.println("queue is full : " + q.isFull());
		q.show();
		

	}


}
