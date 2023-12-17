package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordSearch2 {
	
	// Time Limit Exceeded
	
	public static void helper(char[][] board, List<String> wordList,List<String> wordsList,int i,int j,String word) {
		if(wordList.contains(word)) {
			wordsList.add(word);
			wordList.remove(word);
		}
		
		if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == ' ') {
			return;
		}
		
		char temp = board[i][j];
		board[i][j] = ' ';
		
		helper(board, wordList, wordsList, i+1, j, word + temp);
		helper(board, wordList, wordsList, i, j + 1, word + temp);
		helper(board, wordList, wordsList, i-1, j, word + temp);
		helper(board, wordList, wordsList, i, j - 1, word + temp);
		board[i][j] = temp;
	}

	public static List<String> findWords(char[][] board, String[] words) {
		List<String> wordsList = new ArrayList<String>();
		List<String> wordList = new ArrayList<>(Arrays.asList(words));
		for(int i = 0;i<board.length;i++) {
			for(int j = 0;j<board[0].length;j++) {
				helper(board, wordList, wordsList,i,j, "");
			}
		}
		return wordsList;
	}

	public static void main(String[] args) {
		char[][] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
		String[] words = {"oath","pea","eat","rain"};
		System.out.println(findWords(board, words));
	}

}
