package recursion;
import java.util.ArrayList;
import java.util.Arrays;
public class linearsearchhh {

	//boolean function if found return true else false
	static boolean linear(int arr[], int target, int i) {
	if(i==arr.length) {
		return false;
	}
	
	return arr[i]==target || linear(arr,target,i+1); 
	}
	
	
	//another function which returns index of elemet found
	static int linear2(int arr[], int target, int i) {
		if(i==arr.length) {
			return -1;
		}
		
		if(arr[i]==target) {
			return i;
		}
		else {
			return linear2(arr,target,i+1);
		}
	}
	
	//if we find want to find elemet from right to left
	static int linear3(int arr[], int target, int i) {
		if(i==arr.length) {
			return -1;
		}
		
		if(arr[i]==target) {
			return i;
		}
		else {
			return linear3(arr,target,i-1);
		}
	}
	
	//if we want to print all apearances of target elemet index
	static ArrayList <Integer>list=new ArrayList<>();
	
	static void linear4(int arr[], int target, int i) {
		
		if(i==arr.length) {
			return;
		}
		if(arr[i]==target) {
			list.add(i);
		}
		
		linear4(arr,target,i+1);
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,8,3,4,8,6,7,8,8,13,0};
		int target=8;
		
		System.out.println(linear(arr,target,0));
		int index=linear2(arr,target,0);
		System.out.println(index);
		int index2=linear3(arr,target,arr.length-1);
		System.out.println(index2);
		linear4(arr,target,0);
		System.out.println(list);
	}

}
