package stackandqueue;

public class buyingticketsqueue {

	public static void main(String[] args) {
///////first aproach
		
		int tickets []= {2,3,2}; 
		int k = 2;
		int count=0;
		
	/*	for(int i=0;i<k;i++){
			
			if(tickets[i]>tickets[k]){
				count=count+tickets[k];
				}
			else {
				count=count+tickets[i];
				}
			}
		
		for(int i=k+1;i<tickets.length;i++){
			
			if(tickets[i]>tickets[k]){
				count=count+(tickets[k]-1);
				}
			else if(tickets[i]<tickets[k]) {
				count=count+tickets[i];
				}
			else{
				count=count+tickets[i]-1;
				}
			}		
		
		
		System.out.println(count+tickets[k]);*/
		
		
		/////////// second aproach 
		
		int n=tickets.length;
		// upto k the position form 0
        for(int i=0;i<k+1;i++){
            if(tickets[i]>=tickets[k]){
                count=count+tickets[k];
            }else{
                 count=count+tickets[i];
            }
        }
        // upto last postion from k th postion
        for(int i=k+1;i<n;i++){
           if(tickets[i]>=tickets[k]){
                count=count+tickets[k]-1;
            }else{
                 count=count+tickets[i];
            }     
    }
        System.out.println(count);;
	}

}
