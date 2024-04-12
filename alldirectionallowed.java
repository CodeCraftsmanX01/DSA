package backtracking;

public class alldirectionallowed {

	public static void main(String[] args) {
		boolean board[][]= {
				{true,true,true},
				{true,true,true},
				{true,false,true}
				};
		pathalldirection("",board,0,0);

	}

	static void pathalldirection(String path, boolean[][] board, int row, int column) {
		if(row==board.length-1 && column==board.length-1) {
			System.out.println(path);
			return;
		}
		if(!board[row][column]) {
			return;
		}
		board[row][column]=false;
		
		if(row<board.length-1) {
			pathalldirection(path+'D',board,row+1,column);
		}
		if(column<board.length-1) {
			pathalldirection(path+'R',board,row,column+1);
		}
		if(row>0) {
			pathalldirection(path+'U',board,row-1,column);
		}
		if(column>0) {
			pathalldirection(path+'L',board,row,column-1);
		}
		
		board[row][column]=true;
		
	}

}
