package Pieces;

import Board.Square;

public class King extends Piece{


    public King(Square square, PieceColor color) {
        super(square, color);
    }

    @Override
    public String toString() {
        if(color == PieceColor.WHITE){
            return "G";
        }else
            return "g";
    }
}
