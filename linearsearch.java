package recursion;
import java.util.*;
public class linearsearch {
	//boolean function
	static boolean linear(int arr[], int target, int i) {
		
		if(i==arr.length) {
			return false;
		}
		return arr[i]==target || linear(arr,target,i+1);
	}
	
	
	//if we want index value
	static int linear2(int arr[], int target, int index) {
			
			if(index==arr.length) {
				return -1;
			}
			if(arr[index]==target) {
				return index;
			}
			else {
			return linear2(arr,target,index+1);
			}
		}
	
	
	//if we want to find element from right to left
	static int searchfromlast(int arr[], int target, int index) {
		if(index==-1) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}
		else {
			return searchfromlast(arr, target, index-1);
		}
		}
	
	
	
	//if we find all the index of element 
	//we nee dan arraylist to store all the indexes\
	static ArrayList<Integer> list=new ArrayList<>();
	
	static void allindex(int arr[], int target, int index) {
		if(index==arr.length) {
			return;
		}
		if(arr[index]==target) {
			list.add(index);
		}
		allindex(arr,target,index+1);
		
	}
	
	public static void main(String[] args) {
		int arr[]= {3,2,4,1,5,8,7,4,2,4};
		int target=4;
		boolean ans=linear(arr,target, 0);
		int ans2=linear2(arr, target,0);
		int ans3=searchfromlast(arr, target, arr.length-1);
		
		System.out.println(ans);
		System.out.println(ans2);
		System.out.println(ans3);
		allindex(arr, target, 0);
		System.out.println(list);
		
	
	}

}
