package neumont;

import java.util.Scanner;

public class Chess
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Board board = new Board();
		Piece piece = new Piece(PieceType.NOPIECE);
		String boardPosition;
		String newPosition;
		
		board.draw();
		
		System.out.println("Choose the piece you'd like to move example: (A7)");
		
		boardPosition = input.nextLine();
		
		System.out.println("Choose where to go: (A7)");
		
		newPosition = input.nextLine();
		
		board.movePiece(boardPosition, newPosition);
		
		board.draw();
		
		// start loop for game
		// draw board
		// input for piece selected
		// draw board with pieces potential moves
		// input for move
		
		// if statements if piece is on top of other piece delete piece that got
		//taken and replace with moved piece
		// if spot is empty change empty space to chess piece and change
		//spot of original spot to null
		// check for check on every move
		// also check for checkmate / win
		
	}

}
