package Arrays;

import java.util.Arrays;

public class ArrayList<T> {
	public static String data;

	public static void main(String[] args) {
		 int nums[] = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
		 int l[] = {0,1,6,4,8,7};
		 int r[] = {4,4,9,7,9,10};
	
		 boolean res=false;
		 ArrayList<Boolean> list = new ArrayList<>();
		
		 
		 for(int i=0; i<=l.length; i++) {
			 int arr[]=new int[r[i]-l[i]+1];
			 for(int j=l[i]; j<=r[i]; j++ ) {
				
					arr[j]=nums[j];
					 }
			 Arrays.sort(arr);
			 System.out.println(Arrays.toString(arr));
			
			 
			 
			for(int k=0;k<nums.length-1; k++) {
				 if((arr[k+1]-arr[i])==(arr[1]-arr[0])) {
					 
					 res=true;
		
				}
				 else {
					 res=false;
					 break;
				 }
				}
			 list[i]=res;
			 Arrays.fill(arr, 0);
			
			 
			//System.out.println(Arrays.toString(ans));
			
		 }
		
		//System.out.println(Arrays.toString(ans));
	}

	public void add(int data) {
		// TODO Auto-generated method stub
		
	}

	public void addAll(ArrayList<Integer> value) {
		// TODO Auto-generated method stub
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addAll(Integer value) {
		// TODO Auto-generated method stub
		
	}

	public void remove(int i) {
		// TODO Auto-generated method stub
		
	}

	public boolean contains(int i) {
		// TODO Auto-generated method stub
		return false;
	}
}
