package Pieces;

import Board.Square;

public class Rook extends Piece{
    public Rook(Square square, PieceColor color) {
        super(square, color);
    }

    @Override
    public String toString() {
        if(color == PieceColor.WHITE){
            return "R";
        }else
            return "r";
    }
}
