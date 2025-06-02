package boqnkaZada4ki;

import java.util.*;

public class Zad1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n, m;
		
		do {
			n = kb.nextInt();
			m = kb.nextInt();
			if (n <= 0 || m <= 0) {
				System.out.println("Please enter natural numbers as inputs!");
			}
		} while (n <= 0 || m <= 0);
		
		int[][] board = new int[n][m];
		
		ArrayList<Integer> x_coords = new ArrayList<>();
		ArrayList<Integer> y_coords = new ArrayList<>();
		
		
		// enter input
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("Enter symbol for board[" + i + "][" + j + "]: ");
				board[i][j] = kb.nextInt();
				if (board[i][j] == 9) {
					x_coords.add(i);
					y_coords.add(j);
				}
			}
		}
		
		// print board (original)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		
		// change board
		for (int i = 0; i < x_coords.size(); i++) {
			for (int j = 0; j < m; j++) {
				board[x_coords.get(i)][j] = 9;
			}
		}
		for (int i = 0; i < y_coords.size(); i++) {
			for (int j = 0; j < n; j++) {
				board[j][y_coords.get(i)] = 9;
			}
		}
		
		System.out.println("\n" + "Changed board: ");
		// print board (changed)
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}
