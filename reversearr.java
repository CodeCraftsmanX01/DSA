package babbar;

public class reversearr {

	public static void main(String[] args) {
	int arr[]={12, 13, 14, 17, 12, 10, 19};
	reverse(arr, arr.length);
	int n;
	int a[];

	}
	static void reverse(int a[], int n) {
		int i, k, t;
		for(i=0; i<=n/2; i++) {
			t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;
		
		
			
		}
		
		System.out.println("reversed array is =");
		for(k=0; k<n; k++) {
			System.out.print(a[k]+"  ");
		}
	}

}
