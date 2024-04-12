package Strings;

public class PasswordChecker {

	
		//atleast 8 characters in password
		public static Boolean MinChar(String password, boolean ans) {
			if(password.length()>=8) {
				ans=true;
			}
			return ans;
			
			}
			//atleast one lower case
			public static Boolean lower(String password, boolean ans) {
			for(int i=0; i<password.length(); i++) {
				if(password.charAt(i)>=97 && password.charAt(i)<=122) {
					ans=true;
					break;
				}
			}
			
			return ans;
			}
			//atleast one upper case
			public static Boolean Upper(String password, boolean ans) {
			for(int i=0; i<password.length(); i++) {
				if(password.charAt(i)>=65 && password.charAt(i)<=90) {
					ans=true;
					break;
				}
			}
			return ans;
			}
			public static Boolean integr(String password, boolean ans) {
			//atleast one digit integer
				String count= "1234567890";
			for(int i=0; i<password.length(); i++) {
				for(int j=0; j<count.length(); j++) {
				if(password.charAt(i)==count.charAt(j)) {
					ans=true;
					break;
				}
				}
			}
			return ans;
			}
			public static Boolean special(String password, boolean ans) {
			//atleast one special charcater
				String characters="!@#$%^&*()-+";
			for(int i=0; i<password.length(); i++) {
				for(int j=0; j<characters.length(); j++) {
				if(password.charAt(i)==characters.charAt(j)) {
					ans=true;
					break;
				}
				}
			}
			return ans;
			}
			//does not contain adjacent characters
			public static Boolean adjacent(String password, boolean ans) {
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
		return ans;
		}
		public static void main(String[] args) {
			String password ="ecuwcfoyajkolntovfniplayrxhzpmhrkhzonopcwxgupzhoupw";
			boolean ans=false;

			 
			if( PasswordChecker.special(password, ans)==false||PasswordChecker.adjacent(password, ans)==false ||PasswordChecker.Upper(password, ans)==false|| PasswordChecker.lower(password, ans)==false
			 || PasswordChecker.integr(password, ans)==false||PasswordChecker.MinChar(password, ans)==false) {
				 ans=false;
			 }
			 else {
				 ans=true;
			 }
			System.out.println(ans);
			
	}

}
