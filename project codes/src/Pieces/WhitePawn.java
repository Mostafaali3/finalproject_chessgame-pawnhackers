package Pieces;

import Board.Square;

public class WhitePawn extends Piece{
    public WhitePawn(Square square, PieceColor color) {
        super(square, color);
    }
    @Override
    public String toString(){
        return "P";
    }
}
