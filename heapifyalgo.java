package heaps;

public class heapifyalgo {

	//heapify function very very important
		public static void heapify(int arr[],int n,int index) {
			int largest =index;
			int left=2*index;
			int right=2*index+1;
			
			if(left<n && arr[largest]<arr[left]) {
				largest=left;
			}
			if(right<n && arr[largest]<arr[right]) {
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
		for(int i=n/2; i>0;i--) {
			heapify(arr,n,i);
		}
		System.out.println("printing the array");
		System.out.println();
		for(int i=1; i<=n; i++) {
			System.out.print(arr[i]+", ");
		}

	}

}
