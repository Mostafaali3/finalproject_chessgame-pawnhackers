package Board;

import Pieces.Piece;

import javax.swing.*;

public class Square extends JLabel {

    private final GameBoard board;
    private final int col;
    private final int row;
    private Piece piece;
    public Square(GameBoard board,int row,int col){
        this.board=board;
        this.col=col;
        this.row=row;
    }



    public void setPiece(Piece piece) {
        this.piece = piece;
    }











    /* int XSquarePosition;
    int ySquarePosition;
    Piece piece;




    public Square(int X,int Y){
        this.XSquarePosition=X;
        this.ySquarePosition=Y;
    }

    public boolean isEmpty(){
        if (this.piece == null){
            return true;
        }else
            return false;
    }

    public int getXSquarePosition() {
        return XSquarePosition;
    }

    public void setXSquarePosition(int XSquarePosition) {
        this.XSquarePosition = XSquarePosition;
    }

    public int getySquarePosition() {
        return ySquarePosition;
    }

    public void setySquarePosition(int ySquarePosition) {
        this.ySquarePosition = ySquarePosition;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }*/
}
