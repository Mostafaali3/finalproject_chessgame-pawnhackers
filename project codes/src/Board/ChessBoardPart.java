package Board;

import java.awt.*;

public class ChessBoardPart {
    private ChessRoom chessRoom;

    public void CreateComposite(Composite parent){

        chessRoom = new ChessRoom();
        GameBoard board = chessRoom.getBoard();
        board.display();
    }


}
