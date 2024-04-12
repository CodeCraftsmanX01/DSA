package babbarleetcode;

public class squareRootofKey {
public static int sqr(int key, int start, int end) {
	
	int ans=-1;
	
	int mid=(start+end)/2;
	while(start<=end) {
		
		int sqr=mid*mid;
		if(sqr==key) {
			return mid;
		}
		if(sqr<key) {
			ans=mid;
			start=mid+1;
		}
		else {
			end=mid-1;
		}
		mid=(start+end)/2;
	}
	return 1;
}

public static void main(String[]args) {
	int key=16 ;
	int start=0; 
	int end = key;
	
	int i=squareRootofKey.sqr(key, start, key);
	if(i!=-1) {
		System.out.println("square root of "+key+" is "+i+" .");
	}
	else {
		System.out.println("no");
	}
}
}
