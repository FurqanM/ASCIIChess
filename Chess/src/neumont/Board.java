package neumont;

public class Board 
{
	Piece boardSetup[][] = new Piece[8][8];
	
	public Board()
	{
		boardSetup[0][0] = new Piece(PieceType.WROOK);
		boardSetup[0][1] = new Piece(PieceType.WKNIGHT);
		boardSetup[0][2] = new Piece(PieceType.WBISHOP);
		boardSetup[0][3] = new Piece(PieceType.WQUEEN);
		boardSetup[0][4] = new Piece(PieceType.WKING);
		boardSetup[0][5] = new Piece(PieceType.WBISHOP);
		boardSetup[0][6] = new Piece(PieceType.WKNIGHT);
		boardSetup[0][7] = new Piece(PieceType.WROOK);
		
		
	}
	
	
	// method to draw board looping through array
	
	
	// method to draw board with pieces alotted moves
	
	
	
	
}
