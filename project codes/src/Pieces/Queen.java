package Pieces;

import Board.Square;

public class Queen extends Piece{
    public Queen(Square square, PieceColor color) {
        super(square, color);
    }

    @Override
    public String toString() {
        if(color == PieceColor.WHITE){
            return "Q";
        }else
            return "q";
    }
}
