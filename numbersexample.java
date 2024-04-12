package recursion;

public class numbersexample {
//write a fnction that takes in a number and prints it
//print first 5 numbers	
	
/*	static void print1(int n) {
		System.out.println(n);
		print2(2);
	}

	// or create new funtions for 2 3 4 5 or call print1 5 times
	static void print2(int n) {
		System.out.println(n);
		print3(3);
	}
	static void print3(int n) {
		System.out.println(n);
		print4(4);
	}
	static void print4(int n) {
		System.out.println(n);
		print5(5); 
	}
	static void print5(int n) {
		System.out.println(n);
	}*/
	
	//or we can use recursion on same functions
	
	static void print(int n) {
		//here value of fuction is 5 then it does not calls anything
		//so we need a breaking or base  statement if (n>6) so return
		if(n==0) {
			return;
		}
		
		//ye call krte time print karega upar se neeche
		System.out.println(n);
		print(n-1);
		//ye return lete time print krega neeche se upar
		System.out.println(n);
	}
	
	//so as we can see all the functions have same execution so why to create this much of fuctions
	//so we use recursion fucntion calls it self
	
	public static void main(String[] args) {
		print(5);
	}

}
