package chess;

import boardgame.Position;

public class ChessPosition {
<<<<<<< HEAD

	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
=======
	
	private char column;
	private int row;
	

	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row <1 || row > 8) {
>>>>>>> 0b542d7768c44246598c472ade08be4f5ac9af3b
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

<<<<<<< HEAD
=======

>>>>>>> 0b542d7768c44246598c472ade08be4f5ac9af3b
	public char getColumn() {
		return column;
	}

<<<<<<< HEAD
	public int getRow() {
		return row;
	}

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}

	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
	}

=======

	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()),8 - position.getRow());
		
	}
	
>>>>>>> 0b542d7768c44246598c472ade08be4f5ac9af3b
	@Override
	public String toString() {
		return "" + column + row;
	}
<<<<<<< HEAD
}
=======
}
>>>>>>> 0b542d7768c44246598c472ade08be4f5ac9af3b
