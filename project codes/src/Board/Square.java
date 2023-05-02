package Board;

import Pieces.Piece;

import javax.swing.*;

public class Square extends JLabel {
    int XSquarePosition;
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
    }
}
