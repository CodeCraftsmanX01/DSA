package backtracking;

public class mazewithobstacles {
	
	static void pathobstacles(String path,boolean[][]board,int row,int column) {
	
		if(row==board.length-1 && column==board.length-1) {
			System.out.println(path);
			return;
		}
		
		
		if(!board[row][column]) {
			return;
		}
		
		if(row<board.length-1) {
			pathobstacles(path+'D',board,row+1,column);
		}
		if(column<board.length-1) {
			pathobstacles(path+'R',board,row,column+1);
		}
		}
	public static void main(String[] args) {
		boolean board[][]= {
							{true,true,true},
							{true,false,true},
							{true,true,true}
							};
		pathobstacles("",board,0,0);

	}

}
