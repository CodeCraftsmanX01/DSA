package recursion;

public class example {
	//recursion is function calling function
	static void msg1() {
		System.out.println("hello world");
		msg2();
	}
	static void msg2() {
		System.out.println("hello world");
		msg3();
	}

	static void msg3() {
		System.out.println("hello world");
		msg4();
	}

	static void msg4() {
		System.out.println("hello world");
		msg5();
	}

	static void msg5() {
		System.out.println("hello world");
	}

	
	public static void main(String[] args) {
		msg1();

	}

}
