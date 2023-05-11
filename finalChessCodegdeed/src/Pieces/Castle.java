package Pieces;

import Main.Board;

import javax.imageio.ImageIO;
import java.io.IOException;

public class Castle extends Piece {
    public Castle(Board board, int col, int row, boolean isWhite) {
        super(board);
        this.col = col;
        this.row = row;
        this.xPos = col * board.squareSize;
        this.yPos = row * board.squareSize;
        this.isWhite = isWhite;
        this.name = "Castle";
        if (isWhite) {
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("white castle.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                this.sprite = ImageIO.read(ClassLoader.getSystemResourceAsStream("black castle.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    public boolean isvalidmovement(int col, int row) {

        return this.col == col || this.row == row;
    }

    @Override
    public boolean movecollideswithpiece(int col, int row) {
        if (this.col > col) {
            for (int c = this.col - 1; c > col; c--) {
                if (board.getPiece(c, this.row) != null)
                    return true;
            }
        }

        if (this.col < col) {
            for (int c = this.col + 1; c < col; c++) {
                if (board.getPiece(c, this.row) != null)
                    return true;
            }
        }

        if (this.row >row) {
            for (int r = this.row - 1; r >row ; r--) {
                if (board.getPiece(this.col, r) != null)
                    return true;
            }
        }

        if (this.row < row) {
            for (int r = this.row +1; r <row; r++) {
                if (board.getPiece(this.col, r) != null)
                    return true;
            }


        }
        return false;
    }

 }
