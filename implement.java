package heaps;

public class implement {
public static int arr[]=new int[100];
public static int size=0;

//inseriton
	public static void insert(int val) {
		//array ka size badha ke end me put krdo val ko
		size=size+1;
		int index=size;
		arr[index]=val;
		
		//place i to correct postion according to heap tree
		while(index>1) {
			int parent=index/2;
			
			if(arr[parent]<arr[index]) {
				int temp= arr[parent];
				arr[parent]=arr[index];
				arr[index]=temp;
				
				
				index=parent;
			}
			else {
				return;
			}
		}
	
	}
	
//deletion
	public static void delete() {
		if(size==0) {
			System.out.println("nothing to delete");
		}
		
		arr[1]=arr[size];
		size--;
		
		//place root node to its correct position
		int index=1;
		while(index<size) {
			int leftindex=(2*index);
			int rightindex=(2*index+1);
			//for left child if greater than root
			if(leftindex<size  && arr[index]<arr[leftindex]) {
				int temp=arr[index];
				arr[index]=arr[leftindex];
				arr[leftindex]=temp;
				
				index=leftindex;
				
			}
			//for right child if greater tha  root
			else if(rightindex<size  && arr[index]<arr[rightindex]) {
				int temp=arr[index];
				arr[index]=arr[rightindex];
				arr[rightindex]=temp;
				
				index=rightindex;
				
			}
			else {
				return;
			}
		}
	}
	
	public static void print(){
		for(int i=1; i<=size; i++) {
			System.out.print(arr[i]+", ");
		}
	}
	public static void main(String[] args) {
		implement heap=new implement();
		heap.insert(50);
		heap.insert(55);
		heap.insert(53);
		heap.insert(52);
		heap.insert(54);
		

		heap.print();
		System.out.println();
		System.out.println();
		heap.delete();
		System.out.println();
		heap.print();
	
		
		
	}

}
