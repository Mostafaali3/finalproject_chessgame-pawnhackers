package Board;

import Pieces.Army;

public class ChessGame {
    private final GameBoard board;

    public ChessGame(){
        Army whiteArmy=new Army();
        Army blackArmy=new Army();
        board = new GameBoard(whiteArmy,blackArmy);
        
    }
}
