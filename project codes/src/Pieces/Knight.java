package Pieces;

import Board.Square;

public class Knight extends Piece{
    public Knight(Square square, PieceColor color) {
        super(square, color);
    }

    @Override
    public String toString() {
        return "Knight{" +
                "color=" + color +
                '}';
    }
}
