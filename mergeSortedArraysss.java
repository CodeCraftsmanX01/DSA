package babbar;
import java.util.Arrays;
public class mergeSortedArraysss {
public static void main(String[] args) {
	int a[]= {1, 3, 5, 0, 0, 0};
	int b[]= {2, 4, 6};
	int i=a.length-1;
	int j=b.length-1;
	int k=(a.length+b.length)-1;
	
	while (j >= 0) {
	      if (i >= 0 && a[i] > b[j])
	        a[k--] = a[i--];
	      else
	        a[k--] = b[j--];
	  }
	System.out.println(Arrays.toString(a));
	
	
	
	/*for(int i=0; i<a.length; i++) {
		a[i+a.length]=b[i];
	}
	System.out.println(Arrays.toString(a));
	}*/
}
}
