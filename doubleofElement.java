package babbarleetcode;

public class doubleofElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,7,11};
	
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++ ) {
				if(arr[i]==2*arr[j]) {
					System.out.println("true");
				}
				}
			
		}
		System.out.println("false");
	

	}

}
