package searching;

public class findinmountainArray {

	public static void main(String[] args) {
		int []arr = {1,2,3,4,5,3,1};
		int target=3;
        //first find peak index
        int start=0; 
        int end=arr.length-1;
 
        int mid=start+(end-start)/2;
    
        while(start<end){
            if(arr[mid]<arr[mid+1]){
                start=mid+1;    
            }
            else{
                end=mid;
            }
            mid=start+(end-start)/2;
        }
      
        int index1=-1;
        //now first search in 0 to mid means first half of array
        int start1=0; 
        int end1=mid;
        int mid1=start1+(end1-start1)/2;
        while(start1<=end1){
            if(arr[mid1]==target){
                index1=mid1;
            }
            else if(target>arr[mid1]){
                start1=mid1+1;
            }
            else{
                end1=mid1-1;
            }
            mid1=start1+(end1-start1)/2;
        }
        System.out.println(index1);
        
        int index2=-1;
        //now second search mid+1 to MountainArray.length() 
         int start2=mid+1; 
        int end2=arr.length;
        int mid2=start2+(end2-start2)/2;
        while(start2<=end2){
            if(arr[mid2]==target){
                index2=mid2;
            }
            else if(target>arr[mid2]){
                start2=mid2+1;
            }
            else{
                end2=mid2-1;
            }
            mid2=start2+(end2-start2)/2;
        }
        System.out.println(index2);
        if(index1>=index2){
            System.out.println(index2);
        }
        else{
            System.out.println(index1);
        }

	}

}
