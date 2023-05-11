package Pieces;

import Main.Board;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Queen extends Piece {
    public Queen(Board board, int col, int row, boolean isWhite) {
        super(board);
        this.col = col;
        this.row = row;
        this.xPos = col * board.squareSize;
        this.yPos = row * board.squareSize;
        this.isWhite = isWhite;
        this.name = "Queen";
        if (isWhite) {
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("white queen.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("black queen.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public boolean isvalidmovement(int col, int row) {

        return (this.col == col || this.row == row || (Math.abs(this.col - col) == Math.abs(this.row - row) ))&&!(this.col==col&&this.row==row);
    }

    @Override
    public boolean movecollideswithpiece(int col, int row) {
//down left
        if (this.col - col >0 && this.row - row < 0) {
            for (int i = 1; i <Math.abs(this.col-col); i++) {
                if (board.getPiece(this.col - i, this.row +  i) != null)
                    return true;

            }


        }
        //down right
        if (this.col - col <0 && this.row - row < 0) {
            for (int i = 1; i <Math.abs(this.col-col); i++) {
                if (board.getPiece(this.col + i, this.row + i) != null)
                    return true;

            }

//
//
        }

        //up right
   if (this.col - col <0 && this.row - row >0) {
            for (int i = 1; i <Math.abs(this.col-col); i++) {
                if (board.getPiece(this.col + i, this.row - i) != null)
                    return true;

            }

//
//
        }
   //up left
        if (this.col - col >0 && this.row - row >0) {
            for (int i = 1; i <Math.abs(this.col-col); i++) {
                if (board.getPiece(this.col - i, this.row - i) != null)
                    return true;

            }


        }

        if (this.col - col <0 && this.row - row < 0) {
            for (int i = 1; i <Math.abs(this.col-col); i++) {
                if (board.getPiece(this.col + i, this.row + i) != null)
                    return true;

            }

//
//
        }
//

//
//
        if (this.col > col&& this.row==row) {
            for (int c = this.col - 1; c > col; c--) {
                if (board.getPiece(c, this.row) != null)
                    return true;
            }
        }
//
        if (this.col < col&& this.row==row) {
            for (int c = this.col + 1; c < col; c++) {
                if (board.getPiece(c, this.row) != null)
                    return true;
            }
        }

        if (this.row >row&&this.col==col) {
            for (int r = this.row - 1; r >row ; r--) {
                if (board.getPiece(this.col, r) != null)
                    return true;
            }
        }

        if (this.row < row&& this.col==col) {
            for (int r = this.row +1; r <row; r++) {
                if (board.getPiece(this.col, r) != null)
                    return true;
            }


        }
            return false;
        }

    }
