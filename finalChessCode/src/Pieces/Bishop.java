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

    public boolean isvalidmovement(int col, int row){

        return (Math.abs(this.col-col)==1&&(this.row-row==0))||(Math.abs(this.col-col)==Math.abs(this.row-row)&& Math.abs(this.row-row)<=3);}
}
