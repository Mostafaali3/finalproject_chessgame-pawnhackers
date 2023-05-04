package Board;

import GuiFrames.Board;
import Pieces.*;

public class ChessRoom {
    private final GameBoard board;
    protected Board guiBoard;

    public ChessRoom() {
        Army whiteArmy = new Army();
        Army blackArmy = new Army();
        board = new GameBoard(whiteArmy, blackArmy);
        for (int c = 0; c < GameBoard.LENGTH; c++) {
            whiteArmy.addPiece(new WhitePawn(board.getSquare(6, c), PieceColor.WHITE));
            blackArmy.addPiece(new BlackPawn(board.getSquare(1, c), PieceColor.BLACK));
        }
        whiteArmy.addPiece(new Rook(board.getSquare(7, 0), PieceColor.WHITE));
        whiteArmy.addPiece(new Rook(board.getSquare(7, 7), PieceColor.WHITE));
        whiteArmy.addPiece(new Knight(board.getSquare(7, 1), PieceColor.WHITE));
        whiteArmy.addPiece(new Knight(board.getSquare(7, 6), PieceColor.WHITE));
        whiteArmy.addPiece(new Bishop(board.getSquare(7, 2), PieceColor.WHITE));
        whiteArmy.addPiece(new Bishop(board.getSquare(7, 5), PieceColor.WHITE));
        whiteArmy.addPiece(new Queen(board.getSquare(7, 3), PieceColor.WHITE));
        whiteArmy.addPiece(new King(board.getSquare(7, 4), PieceColor.WHITE));

        blackArmy.addPiece(new Rook(board.getSquare(0, 0), PieceColor.BLACK));
        blackArmy.addPiece(new Rook(board.getSquare(0, 7), PieceColor.BLACK));
        blackArmy.addPiece(new Knight(board.getSquare(0, 6), PieceColor.BLACK));
        blackArmy.addPiece(new Knight(board.getSquare(0, 1), PieceColor.BLACK));
        blackArmy.addPiece(new Bishop(board.getSquare(0, 2), PieceColor.BLACK));
        blackArmy.addPiece(new Bishop(board.getSquare(0, 5), PieceColor.BLACK));
        blackArmy.addPiece(new Queen(board.getSquare(0, 3), PieceColor.BLACK));
        blackArmy.addPiece(new King(board.getSquare(0, 4), PieceColor.BLACK));

    }


    public GameBoard getBoard() {
        return board;
    }
}
