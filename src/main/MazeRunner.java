package main;


class Coordinates {

	public int X;

	public int Y;

	public Coordinates(int x, int y) {
		this.X = x;
		this.Y = y;
	}

	public Coordinates(Coordinates coord) {
		this.X = coord.X;
		this.Y = coord.Y;
	}

}

public class MazeRunner {

	private static final int MAZE_HEIGHT = 9;

	private static final int MAZE_WIDTH = 9;

	private static final String WALL = "#";
	
	private static final String TRAVERSED = "T";

	private static final String FREE = " ";

	private static final String SOME_DUDE = "*";

	Coordinates startingPoint = new Coordinates(0, 1);

	Coordinates endingPoint = new Coordinates(7, 8);

	public String[][] maze = new String[][] {

	{ "#", "#", "#", "#", "#", "#", "#", "#", "#" },

	{ " ", " ", " ", " ", "#", " ", " ", " ", "#" },

	{ "#", " ", "#", " ", "#", " ", "#", " ", "#" },

	{ "#", " ", "#", " ", " ", " ", "#", " ", "#" },

	{ "#", " ", "#", " ", "#", " ", "#", "#", "#" },

	{ "#", " ", " ", " ", "#", " ", "#", " ", "#" },

	{ "#", " ", "#", "#", "#", " ", "#", " ", "#" },

	{ "#", " ", " ", " ", " ", " ", " ", " ", "#" },

	{ "#", "#", "#", "#", "#", "#", "#", " ", "#" }, };

	public void printDaMaze() {

		for (int X = 0; X < MazeRunner.MAZE_HEIGHT; X++) {

			for (int Y = 0; Y < MazeRunner.MAZE_HEIGHT; Y++) {

				System.out.print(this.maze[X][Y]);

			}

			System.out.print("\n");
		}
	}

	public boolean solve(int X, int Y) {
		try {
			this.maze[Y][X] = MazeRunner.SOME_DUDE;
			
			if (X == this.endingPoint.X && Y == this.endingPoint.Y) {
				return true;
			}
			// Recursively search for our goal. //

			if (X > 0 && (this.maze[Y][X - 1] == MazeRunner.FREE || this.maze[Y][X - 1] == MazeRunner.SOME_DUDE)

			&& this.solve(X - 1, Y)) {

				return true;

			}

			else if (X < MazeRunner.MAZE_HEIGHT - 1

			&& (this.maze[Y][X + 1] == MazeRunner.FREE || this.maze[Y][X + 1] == MazeRunner.SOME_DUDE)

			&& this.solve(X + 1, Y)) {

				return true;

			}

			else if (Y > 0 && (this.maze[Y - 1][X] == MazeRunner.FREE || this.maze[Y - 1][X] == MazeRunner.SOME_DUDE)

			&& this.solve(X, Y - 1)) {

				return true;

			}

			else if (Y < MazeRunner.MAZE_WIDTH - 1

			&& (this.maze[Y + 1][X] == MazeRunner.FREE || this.maze[Y + 1][X] == MazeRunner.SOME_DUDE)

			&& this.solve(X, Y + 1)) {

				return true;

			} else {
				this.maze[Y][X] = MazeRunner.TRAVERSED;
				return false;
			}
		} catch (Exception e) {
			System.out.println(Y + " " + X);
			throw e;
		}
	}

	public static void main(String[] args) {
		MazeRunner mazeSolverBuggerObj = new MazeRunner();

		if (mazeSolverBuggerObj.solve(mazeSolverBuggerObj.startingPoint.X,

		mazeSolverBuggerObj.startingPoint.Y)) {
			mazeSolverBuggerObj.printDaMaze();
		} else {
			System.out.println("False");
		}

	}

}