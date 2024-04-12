package babbar;

public class linearsearch {
public static void main(String []args) {
	int key=19;
	int arr[]= {12, 13, 14, 17, 12, 10, 19};
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i]==key) {
			System.out.println("element found at ="+i);
		break; 
		}
		
	}
}
}
