package application;

public class Tablero {
	private static char[][] initialBoard() {
		char[][] board = { "aaaaaaaaaaaaaaaaaaaa".toCharArray(),
				"aaaaaaaaaaaaaaaaaaaa".toCharArray(),
				"aaaaaaaaaaaaaaaaaaaa".toCharArray(),
				"aaaaaaaaaaaaaaaaaaaa".toCharArray(),
				"aaaaaaaaaaaaaaaaaaaa".toCharArray(),
				"aaaaaaaaaaaaaaaaaaaa".toCharArray(),	
				"aaaaaaaaaaaaaaaaaaaa".toCharArray(),
				"aaaaaaaaaaaaaaaaaaaa".toCharArray(),
				"aaaaaaaaaaaaaaaaaaaa".toCharArray(),
				"aaaaaaaaaaaaaaaaaaaa".toCharArray(),
				"12aaaaaaaaaaaaaaaaaa".toCharArray(),
				"34aaaaaaaaaaaaaaaaaa".toCharArray()
				};
		return board;
	}
	private static char[][] board=initialBoard();
	public static char[][] getBoard() {
		return board;
	}	
}