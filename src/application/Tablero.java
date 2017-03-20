package application;

public class Tablero {
	private static char[][] initialBoard() {
		char[][] board = { "aaaaaaaaaa".toCharArray(),
				"aaaaaaaaaa".toCharArray(),
				"aaaaaaaaaa".toCharArray(),
				"aaaaaaaaaa".toCharArray(),
				"aaaaaaaaaa".toCharArray(),
				"aaaaaaaaaa".toCharArray(),				
				"aaaaaaaaaa".toCharArray(),
				"aaaaaaaaaa".toCharArray(),
				"aaaaaaaaaa".toCharArray(),
				"aaaaaaaaaa".toCharArray(),
				"11aaaaaaaa".toCharArray(),
				"11aaaaaaaa".toCharArray()
				};
		return board;
	}
	private static char[][] board=initialBoard();
	public static char[][] getBoard() {
		return board;
	}	
}