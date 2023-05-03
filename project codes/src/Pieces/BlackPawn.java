package Pieces;

import Board.Square;

public class BlackPawn extends Piece {


    public BlackPawn(Square square, PieceColor color) {
        super(square, color);
    }
    @Override
    public String toString(){
        return "p";
    }
}
