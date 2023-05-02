package Pieces;

import Board.Square;

public class King extends Piece{
    boolean isCastled;
    boolean isChecked;

    public boolean isCastled() {
        return isCastled;
    }

    public void setCastled(boolean castled) {
        isCastled = castled;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    @Override
    public boolean canMove(Square s1, Square s2) {
        return false;
    }
}
