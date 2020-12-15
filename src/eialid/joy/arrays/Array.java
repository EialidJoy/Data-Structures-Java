package eialid.joy.arrays;

public class Array {
	int arr[];
	int count = 0;

	public Array() {

	}

	public Array(int length) {
		arr = new int[length];
	}

	public void insert(int value) {
		if (count == arr.length) {

			int arr1[] = new int[arr.length * 2];
			for (int i = 0; i < arr.length; i++) {
				arr1[i] = arr[i];
			}
			arr = arr1;
		}
		arr[count] = value;
		count++;
	}

	public void removeAt(int index) {
		// validating index
		if(index<0 || index>=count) {
			throw new IllegalAccessError();
		}
		
		// shifting values   
		for(int i=index; i<count; i++) {
			arr[i]=arr[i+1];
		}
		
		count--;
	}
	
	public int indexOf(int value) {
		for(int i=0; i<count; i++) {
			if(arr[i]==value) {
				return i;
			}
		}
		return -1;
	}

	public void print() {
		for (int i = 0; i < count; i++)
			System.out.println(arr[i]);
	}

}
