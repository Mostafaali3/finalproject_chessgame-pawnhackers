package Pieces;

import Main.Board;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Pawn extends Piece{
    public Pawn(Board board, int col, int row , boolean isWhite) {
        super(board);
        this.col=col;
        this.row=row;
        this.xPos=col* board.squareSize;
        this.yPos=row* board.squareSize;
        this.isWhite=isWhite;
        this.name = "Pawn";
        if (isWhite){
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("white pawn.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("black pawn.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }


    public boolean isvalidmovement(int col, int row){
        int colorindex= isWhite?1:-1;

        if(this.col==col&&row==this.row-colorindex)
            return true;
        //pawn first move
       if( isFirstMove && this.col==col && row==this.row-colorindex*2 && board.getPiece(col,row)==null&&board.getPiece(col,row+colorindex)==null)
     return true;
// for white pawn
//     if(((col-this.col==this.row-row&&col-col<this.col) ||(col-this.col+row-this.row==0&&row-this.row<col-this.col))&& colorindex==1 && board.getPiece(col,row)!=null)
//         return true;
//
//        if(((col-this.col==row-this.row&&col>this.col)||( col-this.col< row-this.row && col-this.col+row-this.row==0)) && colorindex==-1 && board.getPiece(col,row)!=null)
//            return true;
        if(((this.col-col==-1&&this.row-row==1)||this.col-col==1&&this.row-row==1) && colorindex==1 && board.getPiece(col,row)!=null)
         return !(this.col==col&&this.row==row);

        if(((this.col-col==-1&&row-this.row==1)||this.col-col==1&&row-this.row==1) && colorindex==-1 && board.getPiece(col,row)!=null)
            return !(this.col==col&&this.row==row);
     return false;
    }

    }
