package backtracking;

public class alldirectionsallowedtomove {

	
	static void pathalldirection(String path,boolean[][]maze,int row,int column) {
		
		if(row==maze.length-1 && column==maze.length-1) {
			System.out.println(path);
			return;
		}
		
		
		if(!maze[row][column]) {
			return;
		}
		
		//if not false it means it a considering this block in my path
		maze[row][column]=false;
		
		//down
		if(row<maze.length-1) {
			pathalldirection(path+'D',maze,row+1,column);
		}
		//right
		if(column<maze.length-1) {
			pathalldirection(path+'R',maze,row,column+1);
		}
		//up
		if(row>0) {
			pathalldirection(path+'U',maze,row-1,column);
		}
		//left
		if(column>0) {
			pathalldirection(path+'L',maze,row,column-1);
		}
		
		//when i am getting out from above calls at return position
		//this line is where the function will be over
		//so before the function gets removed,also remove the changes that were made by that function
		maze[row][column]=true;
		}
	
	public static void main(String[] args) {
		boolean board[][]= {
				{true,true,true},
				{true,true,true},
				{true,true,true}
				};
		pathalldirection("",board,0,0);

	}

}
