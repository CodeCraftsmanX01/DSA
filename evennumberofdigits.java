package babbarleetcode;

public class evennumberofdigits {

	public static void main(String[] args) {
		int a[]= {12,345,2,6,7896};
		
		System.out.println(findNumbers(a));
		
	}
	static int numberOfDigits(int n) {
		
		int count=0;
		
			while (n!=0) {
				n=n/10;
				count++;
				
			}
return count;
		
		}
	static int findNumbers(int a[]) {
		int result=0;
		for(int i=0; i<a.length; i++) {
			if(numberOfDigits(a[i])%2==0) {
				result++;
			}
		}
		return result;
				
	}

	}




/*int count=0;
for(int i=0;i<nums.length;i++){
    int len = Integer.toString(nums[i]).length();
    if(len%2==0)
        count++;
}
return count;
}*/

