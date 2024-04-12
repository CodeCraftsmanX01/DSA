package Arrays;
import java.util.Arrays;
public class sumUniqueElements {
public static void main(String[] args) {
	int arr[]= {1,2,3,2};

	int sum=0;
	
	for(int i=0; i<arr.length;i++) {
		int count=0;
		for(int j=0; j<arr.length; j++)
			
			if(arr[i]==arr[j]) {
		count++;
			}
		
			if(count==1) {
				sum=sum+arr[i];
			}
		
	}
		
	System.out.println(sum);
}
	
	
}


/*for(int i = 0; i < nums.size(); i++){
    for(int j = 0; j < nums.size(); j++){
        if(j == i){
            sum += nums[i];
        }
        if(nums[i] == nums[j]){
            break;
        }
    }
        
}    
return sum;
}*/