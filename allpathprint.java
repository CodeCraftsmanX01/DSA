package backtracking;

import java.util.Arrays;

public class allpathprint {
	static void allpathcount(String path,boolean[][]maze,int row,int column, int patth[][],int step) {

	if(row==maze.length-1 && column==maze.length-1) {
		patth[row][column]=step;
		for(int []arr:patth) {
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(path);
		System.out.println();
		return;
	}
	
	
	if(!maze[row][column]) {
		return;
	}
	
	//if not false it means it a considering this block in my path
	maze[row][column]=false;
	patth[row][column]=step;
	
	//down
	if(row<maze.length-1) {
		allpathcount(path+'D',maze,row+1,column,patth, step+1);
	}
	//right
	if(column<maze.length-1) {
		allpathcount(path+'R',maze,row,column+1,patth,step+1);
	}
	//up
	if(row>0) {
		allpathcount(path+'U',maze,row-1,column,patth,step+1);
	}
	//left
	if(column>0) {
		allpathcount(path+'L',maze,row,column-1,patth,step+1);
	}
	
	//when i am getting out from above calls at return position
	//this line is where the function will be over
	//so before the function gets removed,also remove the changes that were made by that function
	maze[row][column]=true;
	patth[row][column]=0;
	}

public static void main(String[] args) {
	boolean board[][]= {
			{true,true,true},
			{true,true,true},
			{true,true,true}
			};
	
	int [][]patth=new int[board.length][board.length];
	allpathcount("",board,0,0,patth,1);

}
}
