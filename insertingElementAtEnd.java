package babbar;

public class insertingElementAtEnd {
public static void main(String[] args) {
	int arr[]= {1, 2, 3, 4, 5};
	
	for(int i=4; i>=0;i--) {
		arr[i+1]=arr[i];
	}
	arr[0]=9;
	System.out.println(arr);
}
}
