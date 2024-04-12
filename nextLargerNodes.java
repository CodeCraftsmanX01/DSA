package stackandqueue;
import java.util.LinkedList;
import java.util.Stack;
public class nextLargerNodes {

	public static void main(String[] args) {
	LinkedList<Integer> lt=new LinkedList<>();
	lt.add(2);
	lt.add(7);
	lt.add(4);
	lt.add(3);
	lt.add(5);
	
	if(head == null || head.next == null){
        return new int[]{0};
    }
    ListNode temp=head;
    int size=0;
    int index=0;
    while(temp!=null){
        temp=temp.next;
        size++;
    }
    int arr[]=new int[size];
    
    while(temp!=null){
       ListNode temp1=temp.next;
            while (temp1!=null){
                    if(temp1.val>temp.val){
                        arr[index++]=temp1.val;
                        break;
                    }
                else{
                    temp1=temp1.next;
                    }
                }
        if(temp==null){
            arr[index++]=0;
        }
        temp=temp.next;
    }
    return arr;
	
	
	}

}
