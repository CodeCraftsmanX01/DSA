package backtracking;

public class mazee {
	//these two function are for only down and right ward
	
	static int count(int row,int column) {
		
		if(row==1 || column==1) {
			return 1;
		}
		
		int down=count(row-1,column);
		int right=count(row,column-1);
		
		return down+right; 
	}
	
	static void pathprint(String path,int row,int column) {
		if(row==1 && column==1) {
			System.out.println(path);
			return;
		}
		
		if(row>1) {
			pathprint(path+"D",row-1,column);
		}
		if(column>1) {
			pathprint(path+"R",row,column-1);
		}
	}
	
	
	//now what if we want to travel diagonally also
	static int count2(int row,int column) {
			
			if(row==1 || column==1) {
				return 1;
			}
			
			int down=count2(row-1,column);
			int right=count2(row,column-1);
			int diagonal=count2(row-1,column-1);
			
			return down+right+diagonal; 
		}
		
		static void pathprint2(String path,int row,int column) {
			if(row==1 && column==1) {
				System.out.println(path);
				return;
			}
			
			if(row>1) {
				pathprint2(path+"D",row-1,column);
			}
			if(column>1) {
				pathprint2(path+"R",row,column-1);
			}
			if(row>1 && column>1) {
				pathprint2(path+"Di",row-1,column-1);
			}
		}
	
	
	
	public static void main(String[] args) {

		int ans=count(3,3);
		System.out.println("number of paths to reach the end :-"+ans);
		System.out.println();
		
		System.out.println("paths are :-");
		pathprint("",3,3);
		
		int ans2=count2(3,3);
		System.out.println("number of paths to reach the end :-"+ans2);
		System.out.println();
		System.out.println("paths are :-");
		pathprint2("",3,3);
	}

}
