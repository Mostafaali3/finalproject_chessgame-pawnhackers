package Pieces;

import Board.Square;

public class Bishop extends Piece{

    public Bishop(Square square, PieceColor color) {
        super(square, color);
    }

    @Override
    public String toString() {
        return "Bishop{" +
                "color=" + color +
                '}';
    }
}
