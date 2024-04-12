package babbar;

public class duplicate {
	public static void main(String[] args) {
		int ans=0;
		int arr[]= {1, 3, 2, 3, 4, 5, 9, 7};
		for(int i=0; i<arr.length; i++) {
			ans=ans^arr[i];
	
		}
		
		for(int i=1; i<arr.length;i++ ) {
			ans=ans^arr[i];
		}
System.out.println(arr[ans]);
	}
}
