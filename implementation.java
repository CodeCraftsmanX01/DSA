package stackandqueue;

public class implementation {

	public int arr[];
	public int top;
	public int pop;
	public int size;
	
	implementation(int size){
		this.size=size;
		arr=new int[size];
		top=-1;
	}
	
	
	public void push(int element) {
		if(size-top>1) {
			top++;
			arr[top]=element;
		}
		else {
			System.out.println("stack overflow");
		}
		
	}
	
	public void pop() {
		if(top>=0) {
			top--;
		}
		else {
			System.out.println("stack underflow");
		}
		
	}
	
	 public int peak() {
		if(top>=0) {
			return arr[top];
		}
		else {
			System.out.println("stack is empty");
			return -1;
		}
		
	}
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		implementation st=new implementation(5);
		
		st.push(22);

		
		System.out.println(st.peak());
		st.pop();
		System.out.println(st.peak());
		
		
	}
}
