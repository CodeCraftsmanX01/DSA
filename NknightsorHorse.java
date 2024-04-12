package backtracking;

public class NknightsorHorse {

	static void horses(boolean[][]board,int row, int col, int knights) {
	if(knights==0){
		display(board);
		System.out.println();
		return;
	}
	if(row==board.length-1 && col==board.length){
		return;
	}
	
	if(col==board.length) {
		horses(board,row+1,0,knights);
		return;
	}
	
	if(isSafe(board,row,col)) {
		board[row][col]=true;
		horses(board,row,col+1,knights-1);
		board[row][col]=false;
	}
	
	horses(board,row,col+1,knights);
	}
	
	
	static boolean isSafe(boolean[][]board,int row, int col) {
		if(isValid(board,row-2,col-1)) {
			if(board[row-2][col-1]) {
				return false;
			}
		}
		if(isValid(board,row-1,col-2)) {
			if(board[row-1][col-2]) {
				return false;
			}
		}
		if(isValid(board,row-2,col+1)) {
			if(board[row-2][col+1]) {
				return false;
			}
		}
		if(isValid(board,row-1,col+2)) {
			if(board[row-1][col+2]) {
				return false;
			}
		}
		return true;
	}
	
	//do not repeat yourself hence created this function
	static boolean isValid(boolean[][]board,int row,int col) {
		if(row>=0 && row<board.length && col>=0 && col<board.length) {
			return true;
		}
		return false;
		
	}
	
	static void display(boolean[][] board) {
		for(boolean[] row: board) {
			for(boolean element:row) {
				if(element) {
					System.out.print("K ");
				}
				else {
					System.out.print("x ");
				}
			}
			System.out.println();
		}
		}
	
	
	public static void main(String[] args) {
		int n=4;
		boolean[][]board=new boolean[n][n];
		horses(board,0,0,n);
	}

}
