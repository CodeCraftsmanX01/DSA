package Strings;

public class multiplyString {

	public static void main(String[] args) {
	String num1 = "123", num2 = "456";
	/*int carry=0;
	String result="";
		for(int i=num1.length()-1; i>=0; i--) {
		 for(int j=num2.length()-1; j>=0; j--){
			
		int mul=((num1.charAt(i)-'0')*(num2.charAt(j)-'0'))+carry;
		if(j>0) {
			result=(mul%10)+result;
			}
		else {
			result=mul+result;
			}
			carry=mul/10;
		  }
		
		  System.out.println(result);
		
		  result="";
		  carry=0;
		
	}
		int m = num1.length(), n = num2.length();
		int i = 0;
        while(i < m + n && result.charAt(i) == 0) {
            i++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(; i < m + n; i++) {
            sb.append(result.charAt(i));
        }
      System.out.println(sb.toString());*/
	
	
	 if(num1.equals("0") || num2.equals("0")){
        System.out.println("0");
    }
     int[] arr=new int[num1.length()+num2.length()];
     
     int index=0;
     for(int i=num1.length()-1;i>=0;i--)
     {
         int carry=0;
         int column=0;
         for(int j=num2.length()-1;j>=0;j--)
         {
             int a=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
             int temp=(arr[index+column]+carry+a);
             arr[index+column]=temp%10;
             carry=temp/10;
             column++;
         }
         if(carry!=0)
         {
             arr[index+column]=carry;
         }
         index++;
     }
     String ans="";
     index=arr.length-1;
     while(arr[index]==0)
     {
         index--;
     }
     for(int i=index;i>=0;i--)
     {
         ans+=arr[i];
     }
    System.out.println(ans);
 }
    }
		
