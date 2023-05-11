package Pieces;

import Main.Board;
import Main.Move;

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
        return x+y==1|| (x==1&&y==1) ||cancastled( col, row);}


  public  boolean cancastled(int col,int row ){
if(this.row==row) {
    if (col == 6) {
        Piece castle = board.getPiece(7, row);
        if (castle != null && this.isFirstMove && castle.isFirstMove) {
            if (board.sameTeam(castle,this)){
                return board.getPiece(5, row) == null &&
                        board.getPiece(6, row) == null;
            }

        }
    }

    if (col == 2) {
        Piece castle = board.getPiece(0, row);
        if (castle != null && this.isFirstMove && castle.isFirstMove) {
            return board.getPiece(3, row) == null &&
                    board.getPiece(2, row) == null &&
                    board.getPiece(1, row) == null;
        }
    }

}

        return false;
    }
 }