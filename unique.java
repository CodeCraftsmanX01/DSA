package babbar;

public class unique {

	public static void main(String[] args) {
		int ans=0;
		int arr[]= {10, 12, 11, 12, 11, 10, 20, 20, 22};
		for(int i=0; i<arr.length; i++) {
			ans=ans^arr[i];
		}
System.out.println(ans);
	}

}
