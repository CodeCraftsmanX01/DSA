package babbarleetcode;

public class mountainArray {
public static void main(String[] args) {
	int arr[]= {0, 2, 3, 4, 5, 2, 1, 0};

	 if (arr.length < 3)
	        return false;
	    int flag = 0, i = 0;
	    for (i = 1; i < arr.length; i++)
	        if (arr[i] <= arr[i - 1])
	            break;
	 
	    if (i == arr.length || i == 1)
	        return false;
	 
	    for (; i < arr.length; i++)
	        if (arr[i] >= arr[i - 1])
	            break;
	    return i == arr.length;
	}

}
}
