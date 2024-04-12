package heaps;

public class heapsort {

	public static void sort(int arr[],int n) {
		int tempsize=n;
		while(tempsize>1) {
			//step1
			//swap
			int temp=arr[tempsize];
			arr[tempsize]=arr[1];
			arr[1]=temp;
			
			//step2 size--
			tempsize--;
			
			//step3 heapify
			heapify(arr,tempsize,1);
			
			
		}
	}
	//heapify function
	public static void heapify(int arr[],int n,int index) {
		int largest =index;
		int left=2*index;
		int right=2*index+1;
		
		if(left<=n && arr[largest]<arr[left]) {
			largest=left;
		}
		if(right<=n && arr[largest]<arr[right]) {
			largest=right;	
		}
		
		if(largest!=index) {
			int temp=arr[largest];
			arr[largest]=arr[index];
			arr[index]=temp;
			heapify(arr,n,largest);
		}
		
		
	}
	public static void main(String[] args) {
		int arr[]= {-1,54,53,55,52,50};
		int n=arr.length-1;
		
		//heap creation
		for(int i=n/2; i>0;i--) {
			heapify(arr,n,i);
		}
		System.out.println("printing the array");
		System.out.println();
		System.out.print("[");
		for(int i=1; i<=n; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print("]");
		//heap sort
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		sort(arr,n);
		System.out.println("printing the sorted array");
		System.out.println();
		System.out.print("[");
		for(int i=1; i<=n; i++) {
			System.out.print(arr[i]+", ");
		}
		System.out.print("]");
	}

}
