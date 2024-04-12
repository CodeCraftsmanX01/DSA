package Arrays;

public class suffleSTring {
	
	static String suffle(String s, int arr[], int n) {
		char[]ch=s.toCharArray();
		int i=0;
		while(i<n) {
			int correct =arr[i];
			if(arr[i]!=i) {
				char temp1=ch[i];
				ch[i]=ch[correct];
				ch[correct]=temp1;
				
				
				int temp2=arr[i];
				arr[i]=arr[correct];
				arr[correct]=temp2;
			}
			else {
				i++;
			}
		}
		return new String(ch);
	}

	public static void main(String[] args) {
		String s="codeleet";
		int arr[]= {4, 5, 6, 7, 0, 1, 2,3};
		int n=arr.length;
		
		String ans=suffle(s, arr, n);
		System.out.println(ans);
		
		

	}

}
