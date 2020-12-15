package eialid.joy.lists;

import java.util.NoSuchElementException;

public class LinkedLists {
	private class Node{
		private int value;
		private Node next;
		
		
	}
	
	private Node head;
	private Node tail;
	
	public void addLast(int nodeVal) {
		Node node=new Node();
		node.value=nodeVal;
		if(isEmpty()) {
			head=tail=node;	//head and tail has node object which has value=item and next=null here
			
		}
		else {
			tail.next=node;
			tail=node;
		}
	}
	
	public void addFirst(int nodeVal) {
		Node node=new Node();
		node.value=nodeVal;
		
		if(isEmpty()) {
			head=tail=node;
		}
		else {
			node.next=head;
			head=node;
		}
		
	}
	
	private boolean isEmpty() {
		boolean value=head==null;
		return value;
	}
	
	public int indexOf(int nodeVal) {
		int index=0;
		Node currentNode=head;
		
		while(currentNode!=null) {
			if(currentNode.value==nodeVal) {
				return index;
			}
			
			else {
				index++;
				currentNode=currentNode.next;
				
			}
			
		}
		return -1;
	}
	
	public boolean contains(int nodeVal) {
		boolean val=indexOf(nodeVal)!=-1;
		return val;
	}

	public void removeFirst() {
		//10-> 20-> 30->
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		Node copyNode=head.next;
		head.next=null;
		head=copyNode;
		
		
	}
	
	public void removeLast() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		Node currentNode=head;
		while(currentNode!=null) {
			if(currentNode.next==tail) {
				currentNode.next=null;
				tail=currentNode;
			}
			else {
				currentNode=currentNode.next;
		
			}
		}
	}
	
	
	
	
	
	
	

	
	
	
	
}
