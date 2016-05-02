/**
 * 
 */
package array;

/**
 * @author sundaramtiwari
 *
 */
public class StarCombinations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[][] matrix = new char[5][5];
		populate(matrix);
		print(matrix);
	}

	private static void print(char[][] matrix) {
		for (int i=0; i< matrix.length; i++) {
			for (int j=0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}

	private static void populate(char[][] matrix) {
		// Iterate over each row
		for (int i=0; i < matrix.length; i++) {
			int diff = Math.abs(2 - i);
			 matrix[i][0] = diff == 0 ? 'X' : ' ';
			 matrix[i][1] = diff <= 1 ? 'X' : ' ';
			 matrix[i][2] = diff <=2 ? 'X' : ' ';
			 matrix[i][3] = diff <= 1 ? 'X' : ' ';
			 matrix[i][4] = diff == 0 ? 'X' : ' ';
		}
	}

}
