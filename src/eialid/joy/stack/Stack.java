package eialid.joy.stack;

public class Stack {
	
	int top=0;
	int a[]=new int[5];
	public void push(int element) {
		if(top==5) {
			System.out.println("stack is full");
		}
		else {
			a[top++]=element;
			

		}
			}
	public void show() {
		for(int i: a) {
			System.out.println(i);
		}
		
	}
	public void pop() {
		if(top==0) {
			System.out.println("stack is empty");
		}
		else {
			a[--top]=0;	
		}
		
	}
	
	public int size() {
		return top;
	}
	public int peek() {
		// TODO Auto-generated method stub
		return a[top-1];
	}
	public boolean isEmpty() {
		
		return top==0;
	}
	
	
	

}
