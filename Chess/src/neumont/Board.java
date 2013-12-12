package neumont;

public class Board 
{
	private Piece boardSetup[][] = new Piece[8][8];
	
	
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
		boardSetup[1][0] = new Piece(PieceType.WPAWN);
		boardSetup[1][1] = new Piece(PieceType.WPAWN);
		boardSetup[1][2] = new Piece(PieceType.WPAWN);
		boardSetup[1][3] = new Piece(PieceType.WPAWN);
		boardSetup[1][4] = new Piece(PieceType.WPAWN);
		boardSetup[1][5] = new Piece(PieceType.WPAWN);
		boardSetup[1][6] = new Piece(PieceType.WPAWN);
		boardSetup[1][7] = new Piece(PieceType.WPAWN);
		
		for(int y = 2; y <= 5 ; y++)
			for(int x = 0; x < 8; x++)
				boardSetup[y][x] = new Piece(PieceType.NOPIECE);
		
		
		boardSetup[7][0] = new Piece(PieceType.BROOK);
		boardSetup[7][1] = new Piece(PieceType.BKNIGHT);
		boardSetup[7][2] = new Piece(PieceType.BBISHOP);
		boardSetup[7][3] = new Piece(PieceType.BQUEEN);
		boardSetup[7][4] = new Piece(PieceType.BKING);
		boardSetup[7][5] = new Piece(PieceType.BBISHOP);
		boardSetup[7][6] = new Piece(PieceType.BKNIGHT);
		boardSetup[7][7] = new Piece(PieceType.BROOK);
		boardSetup[6][0] = new Piece(PieceType.BPAWN);
		boardSetup[6][1] = new Piece(PieceType.BPAWN);
		boardSetup[6][2] = new Piece(PieceType.BPAWN);
		boardSetup[6][3] = new Piece(PieceType.BPAWN);
		boardSetup[6][4] = new Piece(PieceType.BPAWN);
		boardSetup[6][5] = new Piece(PieceType.BPAWN);
		boardSetup[6][6] = new Piece(PieceType.BPAWN);
		boardSetup[6][7] = new Piece(PieceType.BPAWN);
	}
	
	
	public void draw()
	{
		for(int y = 0; y < 8; y++)
			for(int x = 0; x < 8; x++)
				System.out.println(boardSetup[y][x].getType());
		
		//System.out.print
	}
	
	
	// method to draw board with pieces alotted moves
	
	
	
	
}
