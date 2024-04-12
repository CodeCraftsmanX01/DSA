package backtracking;

public class maze {
//in this we are calculating how many paths are there to reach the end we can move only down and right ward
	static int count(int row, int column) {
		if(row==1 || column==1) {
			return 1;
		}
		
		int left=count(row-1,column);
		int right=count(row,column-1);
		
		return left+right;
	}
	
//in this we want to print actual path we can move only down and right ward
	static void patth(String path, int right,int column) {
	if(right==1 && column==1) {
		System.out.println(path);
		return;
	}
	
	if(right>1) {
		patth(path+'D',right-1,column);
	}
	if(column>1) {
		patth(path+'R',right,column-1);
	}
	}
	
	
//in this we are calculating how many paths are there to reach the end we can move only down and right ward and diagonally
		static int count2(int row, int column) {
			if(row==1 || column==1) {
				return 1;
			}
			
			int left=count2(row-1,column);
			int right=count2(row,column-1);
			int diagonally=count2(row-1,column-1);
			
			return left+right+diagonally;
		}
		
//	//in this we want to print actual path we can move only down and right ward and diagonally
	static void patdiagonal(String path, int row,int column) {
		if(row==1 && column==1) {
			System.out.println(path);
			return;
		}
		
		if(row>1) {
			patdiagonal(path+'D',row-1,column);
		}
		if(column>1) {
			patdiagonal(path+'R',row,column-1);
		}
		if(row>1 && column>1) {
			patdiagonal(path+"di",row-1,column-1);
		}
		
		}
	
	
	public static void main(String[] args) {
		//count of paths
		System.out.println("totaol paths to reach to the end:- "+count(3,3));
		System.out.println();
		//printing paths downward and right
		System.out.println("Paths to travel downward and right :-");
		patth("",3,3);
		System.out.println();
		//printing count of paths in diagonally and downward and right
		System.out.println("totaol paths to reach to the end diagonally also :- "+count2(3,3));
		System.out.println();
		//printing paths downward and right and diagonal
		System.out.println("Paths to travel downward and right and also diagonally :-");
		patdiagonal("",3,3);
		
		
		
	}

}
