package chess;

<<<<<<< HEAD
import boardgame.BoardException;

public class ChessException extends BoardException {
	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}
}
=======
public class ChessException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ChessException(String msg) {
		super(msg);
	}
	

}
>>>>>>> 0b542d7768c44246598c472ade08be4f5ac9af3b
