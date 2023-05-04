package Pieces;

import Main.Board;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Bishop extends Piece {
    public Bishop(Board board, int col, int row , boolean isWhite) {
        super(board);
        this.col=col;
        this.row=row;
        this.xPos=col* board.squareSize;
        this.yPos=row* board.squareSize;
        this.isWhite=isWhite;
        this.name = "Bishop";
        if (isWhite){
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("white bishop.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("black bishop.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
