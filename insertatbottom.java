package stackandqueue;
import java.util.Stack;
public class insertatbottom {

	public Stack<Integer> pushAtBottom(Stack<Integer> myStack, int x) {
			if(myStack.empty()){
		       myStack.push(x);
		       return myStack;
		   }
		      int num=(int) myStack.peek();
		      myStack.pop();
		      
		      pushAtBottom(myStack, x);
		      
		      myStack.push(num);
		      return myStack;
		  }
	
	public static void main(String[] args) {
		Stack<Integer>myStack=new Stack<>();
		myStack.push(40);
		myStack.push(20);
		myStack.push(10);
		myStack.push(30);
		myStack.push(60);
		int X=5;
		
		System.out.println(myStack);
		insertatbottom ob=new insertatbottom();
		ob.pushAtBottom(myStack, X);
		
		System.out.println(myStack);
		

	}
}

