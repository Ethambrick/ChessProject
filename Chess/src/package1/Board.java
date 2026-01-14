public class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        setupPieces();
    }

    private void setupPieces() {
    	for (int col = 0; col < 8; col++) {
    	    board[1][col] = new Pawn(PieceColor.BLACK);
    	    board[6][col] = new Pawn(PieceColor.WHITE);
    	}

        board[0][0] = new Rook(PieceColor.BLACK);
        board[0][7] = new Rook(PieceColor.BLACK);
        board[7][0] = new Rook(PieceColor.WHITE);
        board[7][7] = new Rook(PieceColor.WHITE);

        board[0][1] = new Knight(PieceColor.BLACK);
        board[0][6] = new Knight(PieceColor.BLACK);
        board[7][1] = new Knight(PieceColor.WHITE);
        board[7][6] = new Knight(PieceColor.WHITE);

        board[0][2] = new Bishop(PieceColor.BLACK);
        board[0][5] = new Bishop(PieceColor.BLACK);
        board[7][2] = new Bishop(PieceColor.WHITE);
        board[7][5] = new Bishop(PieceColor.WHITE);

        board[0][3] = new Queen(PieceColor.BLACK);
        board[7][3] = new Queen(PieceColor.WHITE);

        board[0][4] = new King(PieceColor.BLACK);
        board[7][4] = new King(PieceColor.WHITE);
    }

    public Piece getPiece(int row, int col) {
        return board[row][col];
    }
}
