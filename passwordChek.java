package Strings;

public class passwordChek {

	public static void main(String[] args) {
		String password ="ecuwcfoyajkolntovfniplayrxhzpmhrkhzonopcwxgupzhoupw";
		String characters="!@#$%^&*()-+";
		boolean ans=false;
		String count= "1234567890";
		//atleast 8 characters in password
				if(password.length()>=8) {
					//atleast one lower case
					for(int i=0; i<password.length(); i++) {
						if(password.charAt(i)>=97 && password.charAt(i)<=122) {
							ans=true;
							break;
							
						}
					}
					//atleast one upper case
					for(int i=0; i<password.length(); i++) {
						if(password.charAt(i)>=65 && password.charAt(i)<=90) {
							ans=true;
							break;
						}
					}
					//atleast one digit integer
					for(int i=0; i<password.length(); i++) {
						for(int j=0; j<count.length(); j++) {
						if(password.charAt(i)==count.charAt(j)) {
							ans=true;
							break;
						}
						}
					}
					//atleast one special charcater
					for(int i=0; i<password.length(); i++) {
						for(int j=0; j<characters.length(); j++) {
						if(password.charAt(i)==characters.charAt(j)) {
							ans=true;
							break;
						}
						}
					}
					//does not contain adjacent characters
					int i=0; 
					int j=1;
					
					while(i<password.length()-1) {
						if(password.charAt(i)==password.charAt(j)) {
							
							ans=false;
							break;
						}
						else {
							ans=true;
						}
						
						i++;
						j++;
					}	
				}
				else {
					ans=false;
				}
		System.out.println(ans); 
    }
	}

