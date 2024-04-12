package Strings;

public class LongPressedName {

	public static void main(String[] args) {
		String name = "saeed", typed ="ssaaedd";
	/*	int i=0, j=0;
        boolean ans =true;
        while(i < name.length() && j < typed.length()){
            char chari = name.charAt(i);
            char charj = typed.charAt(j);
            if(chari == charj){
                i++; j++;
            } 
            else {
                if (j != 0 && typed.charAt(j-1) == charj){
                    j++;
                }
                else{  
                    ans = false;
                    break;
                }
            }
        }
        while(j > 0 && j < typed.length()){
            if(typed.charAt(j-1) != typed.charAt(j)){
            	ans=false;
                break;
            }
            j++;
        }
        if(i != name.length()){
            ans =false;
        }
        
       System.out.println(ans);*/
		
		
		boolean ans=false;
        int j=0;
        
        if(typed.length()<name.length() || name.charAt(name.length()-1)!=typed.charAt(typed.length()-1))
            ans= false;
        
        
        for(int  i=0;i<typed.length();i++){
            if(j<name.length() && name.charAt(j)==typed.charAt(i)){
                ans=true;
                j++;
            }
            else if(j-1>=0 && name.charAt(j-1)==typed.charAt(i)){
                ans=true;
            }
            else ans= false;
       }
        
        if(j<name.length()-1)
              ans=false;
        
      System.out.println(ans);
    }
	}

