package Others.GameOfLife;

public abstract class GameOfLifeBoard {

	private boolean[][] board;
	private int width;
	private int height;

	public GameOfLifeBoard(int width, int height) {
		this.width = width;
		this.height = height;
		board = new boolean[width][height];
	}

	@Override
	public String toString() {
		String str = "";

		for (boolean[] line : this.board) {
			for (boolean cell : line) {
				if(cell) {
					str += " 1";
				} else {
					str += " 0";
				}
			}
			str += "\n";
		}
		return str.toString();
	}

	public void setBoard(boolean[][] board) {
		this.board = board;
	}

	public boolean[][] getBoard() {
		return board;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public abstract void playTurn();

	public abstract void turnToLiving(int x, int y);

	public abstract void turnToDead(int x, int y);

	public abstract boolean isAlive(int x, int y);

	public abstract void initiateRandomCells(double probabilityForEachCell);

	public abstract int getNumberOfLivingNeightbours(int x, int y);

	public abstract void manageCell(int x, int y);

}
