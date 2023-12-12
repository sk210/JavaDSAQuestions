package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens2Ans2 {
	
	public static boolean isSafe(char[][] board,int row,int col) {
		for(int i = 0;i<board.length;i++) {
			if(board[row][i] == 'Q') {
				return false;
			}
		}
		
		for(int i = 0;i<board.length;i++) {
			if(board[i][col] == 'Q') {
				return false;
			}
		}
		
		int r = row;
		for(int c = col;c >= 0 && r >=0;c--,r--) {
			if(board[r][c] == 'Q') {
				return false;
			}
		}
		
		r = row;
		for(int c = col;c < board.length && r >= 0;c++,r--) {
			if(board[r][c] == 'Q') {
				return false;
			}
		}
		
		r = row;
		for(int c = col;c >= 0 && r < board.length;c--,r++) {
			if(board[r][c] == 'Q') {
				return false;
			}
		}
		
		r = row;
		for(int c = col;c < board.length && r < board.length;c++,r++) {
			if(board[r][c] == 'Q') {
				return false;
			}
		}
		
		return true;
	}
	
	public static int helper(char[][] board,int col) {
		if(col == board.length) {
			return 1;
		}
		int count = 0;
		for(int row = 0;row<board.length;row++) {
			if(isSafe(board,row,col)) {
				board[row][col] = 'Q';
				count += helper(board,col+1);
				board[row][col] = '.';
			}
		}
		return count;
	}

	public static int totalNQueens(int n) {
		char[][] board = new char[n][n];
		return helper(board, 0);
	}

	public static void main(String[] args) {
		System.out.println(totalNQueens(4));

	}

}
