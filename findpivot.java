package searching;

public class findpivot {
//pivot means ke array kaunse index se rotate ho rhi h
	public static void main(String[] args) {
		
		int arr[]= {3,8,10,17,1};
		int start=0;
		int end=arr.length-1;
		
		int mid=start+(end-start)/2;
		while(start<end) {
			if(arr[mid]>=arr[end]) {
				start=mid+1;
			}
			else {
				end=mid;
			}
			mid=start+(end-start)/2;
		}
		System.out.println(mid);
	}

}
