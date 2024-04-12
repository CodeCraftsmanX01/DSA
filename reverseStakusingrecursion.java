package stackandqueue;

import java.util.Stack;

public class reverseStakusingrecursion {
	//isert at bottom function
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
	
	public void reverse(Stack<Integer> myStack) {
		if(myStack.empty()){
	       return;
	   }
	      int num=(int) myStack.peek();
	      myStack.pop();
	      
	      //recursive call
	      reverse(myStack);
	      
	      pushAtBottom(myStack,num);
	  }

public static void main(String[] args) {
	Stack<Integer>myStack=new Stack<>();
	myStack.push(40);
	myStack.push(20);
	myStack.push(10);
	myStack.push(30);
	myStack.push(60);
	
	System.out.println(myStack);
	reverseStakusingrecursion ob=new reverseStakusingrecursion();
	ob.reverse(myStack);
	
	System.out.println(myStack);
}
}
