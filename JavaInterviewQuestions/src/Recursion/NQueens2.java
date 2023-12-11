package Recursion;

import java.util.ArrayList;
import java.util.List;

public class NQueens2 {
	
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
	
	public static void saveBoards(char[][] board,List<List<String>> allBoards) {
		String row = "";
		List<String> newBoard = new ArrayList<String>();
		for(int i = 0;i<board.length;i++) {
			row = "";
			for(int j = 0;j<board[0].length;j++) {
				if(board[i][j] == 'Q') {
					row += 'Q';
				}else {
					row += '.';
				}
			}
			newBoard.add(row);
		}
		allBoards.add(newBoard);
	}
	
	public static void helper(List<List<String>> allBoards,char[][] board,int col) {
		if(col == board.length) {
			saveBoards(board,allBoards);
		}
		for(int row = 0;row<board.length;row++) {
			if(isSafe(board,row,col)) {
				board[row][col] = 'Q';
				helper(allBoards,board,col+1);
				board[row][col] = '.';
			}
		}
	}

	public static int totalNQueens(int n) {
		List<List<String>> allBoards = new ArrayList<List<String>>();
		char[][] board = new char[n][n];
		helper(allBoards, board, 0);
		return allBoards.size();
	}

	public static void main(String[] args) {
		System.out.println(totalNQueens(4));

	}

}
