package Board;

import Pieces.Army;
import Pieces.PieceColor;
import Pieces.WhitePawn;

public class ChessGame {
    private final GameBoard board;

    public ChessGame(){
        Army whiteArmy=new Army();
        Army blackArmy=new Army();
        board = new GameBoard(whiteArmy,blackArmy);
        for (int c=0;c<GameBoard.LENGTH;c++){
            whiteArmy.addPiece(new WhitePawn(board.getSquare(1,c), PieceColor.WHITE));
        }
    }
}
