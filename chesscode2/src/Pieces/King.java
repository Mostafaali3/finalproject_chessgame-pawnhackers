package Pieces;

import Main.Board;

import javax.imageio.ImageIO;
import java.io.IOException;

public class King extends Piece {
    public King(Board board, int col, int row , boolean isWhite) {
        super(board);
        this.col=col;
        this.row=row;
        this.xPos=col* board.squareSize;
        this.yPos=row* board.squareSize;
        this.isWhite=isWhite;
        this.name = "King";
        if (isWhite){
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("white king.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("black king.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    public boolean isvalidmovement(int col, int row){
      int x =  Math.abs( this.col-col);
        int y=Math.abs(this.row-row);
        return x+y==1|| (x==1&&y==1);}
}
