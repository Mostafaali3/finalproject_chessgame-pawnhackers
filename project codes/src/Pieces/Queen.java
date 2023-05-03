package Pieces;

import Board.Square;

public class Queen extends Piece{
    public Queen(Square square, PieceColor color) {
        super(square, color);
    }

    @Override
    public String toString() {
        return "Queen{" +
                "color=" + color +
                '}';
    }
}
