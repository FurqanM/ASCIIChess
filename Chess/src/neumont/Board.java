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
		
		for(int y = 0; y < 8; y++)
			for(int x = 0; x < 8; x++)
			{
				if(boardSetup[y][x].getType() == PieceType.WPAWN)
					boardSetup[y][x].setPicture("WPN");
				if(boardSetup[y][x].getType() == PieceType.WROOK)
					boardSetup[y][x].setPicture("WRK");
				if(boardSetup[y][x].getType() == PieceType.WBISHOP)
					boardSetup[y][x].setPicture("WBP");
				if(boardSetup[y][x].getType() == PieceType.WKNIGHT)
					boardSetup[y][x].setPicture("WKT");
				if(boardSetup[y][x].getType() == PieceType.WQUEEN)
					boardSetup[y][x].setPicture("WQN");
				if(boardSetup[y][x].getType() == PieceType.WKING)
					boardSetup[y][x].setPicture("WKG");
				if(boardSetup[y][x].getType() == PieceType.BPAWN)
					boardSetup[y][x].setPicture("BPN");
				if(boardSetup[y][x].getType() == PieceType.BROOK)
					boardSetup[y][x].setPicture("BRK");
				if(boardSetup[y][x].getType() == PieceType.BBISHOP)
					boardSetup[y][x].setPicture("BBP");
				if(boardSetup[y][x].getType() == PieceType.BKNIGHT)
					boardSetup[y][x].setPicture("BKT");
				if(boardSetup[y][x].getType() == PieceType.BQUEEN)
					boardSetup[y][x].setPicture("BQN");
				if(boardSetup[y][x].getType() == PieceType.BKING)
					boardSetup[y][x].setPicture("BKG");
				if(boardSetup[y][x].getType() == PieceType.NOPIECE)
					boardSetup[y][x].setPicture(" ");
			}
	}
	
	
	public void draw()
	{
		System.out.println("---------------------------------");
		for(int y = 0; y < 8; y++)
		{
			for(int x = 0; x < 8; x++)
			{
				System.out.printf("%3s|",boardSetup[y][x].getPicture());
			}
			System.out.println();
			System.out.println("---+---+---+---+---+---+---+---+");
		}
	}
	
	
	// method to draw board with pieces alotted moves
	
	
	
	
}
