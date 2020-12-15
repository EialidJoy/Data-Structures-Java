package eialid.joy.stack;

public class DynamicStack {
		
		int capacity=2;
		int top=0;
		int a[]=new int[capacity];
		public void push(int element) {
			if(top==capacity) {
				expand(element);
			}
			else {
				a[top++]=element;
				
			}
		}
		
		
		private void expand(int element) {
			capacity =capacity*2;
			int newStack[]=new int[capacity];
			System.arraycopy(a, 0, newStack, 0, a.length);
			a=newStack;
			a[top++]=element;
			
		}
		
		public void pop() {
			if(isEmpty()) {
				System.out.println("stack is empty");
			}
			else {
				a[--top]=0;
				shrink();
				
			}
			
		}
		
		private void shrink() {
			int len=size();
			if(len<=(capacity/2)/2) {
				capacity=capacity/2;
				int newStack[]=new int[capacity];
				System.arraycopy(a, 0, newStack, 0, len);
				a=newStack;

				
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
		
		public void show() {
			for(int i: a) {
				System.out.println(i);
			}
			
		}
		
		

	}

