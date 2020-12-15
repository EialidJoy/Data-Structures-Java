package eialid.joy.queue;

public class Queue {
	int queue[]=new int[4];
	int front,rear,size;
	public void enqueue(int element) {
		
		if(!isFull()) {
			queue[rear%4]=element;
			rear=(rear+1)%4;
			size++;
		}
		else {
			System.out.println("queue is full");
		}
				
	}

	public int deque() {
		int data=0;
		if(!isEmpty()) {
			data=queue[front];
			front=(front+1)%4;
			
		}
		else {
			System.out.println("queue is Empty");

		}
		return data;
		}
	
	
	public void show() {	
		for(int i=front%4; i<queue.length; i++) {
			System.out.println(queue[i%4]);
		}
	}

	public int geSize() {
		
		return size;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return geSize()==0;
	}

	public boolean isFull() {
		return geSize()>=queue.length;
	}
	
}
