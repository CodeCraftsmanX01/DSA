package stackandqueue;

public class twostacks {

	public int arr[];
	public int top1;
	public int top2;
	public int pop1;
	public int pop2;
	public int size;
	
	twostacks(int size){
		this.size=size;
		arr=new int[size];
		top1=-1;
		top2=size;
	}
	
	//push in stack 1
	public void push1(int element) {
		if((top2-top1)>1) {
			arr[top1]=element;
			top1++;
			
		}
		else {
			System.out.println("stack is overflow");
		}
	}
	//push in stack 2
	public void push2(int element) {
		if((top2-top1)>1) {
			arr[top2]=element;
			top2--;
			
		}
		else {
			System.out.println("stack is overflow");
		}
	}
		
	//pop in stack 1
		public int pop1() {
			if(top2<size) {
				int ans=arr[top1];
				top1++;
				return ans;
			}
			else {
				System.out.println("stack underflow");
				return -1;
			}
			
		}
		
		//pop in stack 2
		public int pop2() {
			if(top1>=0) {
				int ans=arr[top1];
				top1--;
				return ans;
			}
			else {
				System.out.println("stack underflow");
				return -1;
			}
			
		}
	
	
	public static void main(String[] args) {
		

	}

}
