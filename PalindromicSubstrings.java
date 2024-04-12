package Strings;

public class PalindromicSubstrings {

	public static void main(String[] args) {
		String s="aaa";
		String nstr="";
		int count=0;
		boolean ans=false;
		for(int i=0; i<s.length(); i++) {
			for(int j=i; j<=s.length(); j++) {
				 nstr = s.substring(i,j);
				
				 int l=0;
				 int m=nstr.length()-1;
				 while(l<=m) {
					
					 if(nstr.charAt(l)!=nstr.charAt(m)) {
						 
					break;
					 }
					 else {
						 count++;
					l++;
					m--;
					
					}
					 
				
			}
		
			
			}
		}
		System.out.println(count);
	}

}

/*class Solution {
public int countSubstrings(String s) {
int count=0;
for(int i=0;i<s.length();i++)
{
for(int j=i;j<s.length();j++)
{
if(isPalin(s,i,j))
count++;
}
}
return count;
}

public boolean isPalin(String s,int st,int ed)
{
    while(st<ed)
    {
        if(s.charAt(st++)!=s.charAt(ed--))
            return false;
    }
    
    return true;
}
}*/