package Pieces;

import Main.Board;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Queen extends Piece{
    public Queen(Board board, int col, int row , boolean isWhite) {
        super(board);
        this.col=col;
        this.row=row;
        this.xPos=col* board.squareSize;
        this.yPos=row* board.squareSize;
        this.isWhite=isWhite;
        this.name = "Queen";
        if (isWhite){
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("white queen.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("black queen.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
