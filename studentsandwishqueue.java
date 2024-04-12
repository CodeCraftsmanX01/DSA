package stackandqueue;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class studentsandwishqueue {

	public static void main(String[] args) {
		int students[] = {1,1,1,0,0,1};
		int sandwiches[] = {1,0,0,0,1,1};
		int ans=0;
	
		Queue<Integer> q1=new LinkedList<>();
		Queue<Integer> q2=new LinkedList<>();
		
		for(int i=0; i<students.length; i++) {
			q1.add(students[i]);
		}
		for(int i=0; i<sandwiches.length; i++) {
			q2.add(sandwiches[i]);
		}
		
		
		boolean flag=true;
		
		while(flag && q1.size()>0 && q2.size()>0) {
			if(q1.peek()==q2.peek()) {
				ans=0;
				q1.remove();
				q2.remove();
			}
			else if(q1.peek()!=q2.peek()){
				ans++;
				 if(ans==q1.size())
		            {
		               flag = false;
		            }
				int val=q1.remove();
				q1.add(val);
			}
			
		}
		System.out.println(q1.size());
	}

}
