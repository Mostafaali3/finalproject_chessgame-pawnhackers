package Main;

import LoginSystem.PromotionWindow;
import Pieces.Piece;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Input extends MouseAdapter {
    String pieceString = null;
    Board board;
    private int count=0;

    public Input(Board board) {
        this.board = board;
    }


    @Override
    public void mousePressed(MouseEvent e) {
        int col = e.getX() / board.squareSize;
        int row = e.getY() / board.squareSize;
        Piece pieceXY = board.getPiece(col, row);
        if (pieceXY != null) {
            board.selectedPiece = pieceXY;
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (board.selectedPiece != null) {
            board.selectedPiece.xPos = e.getX() - board.squareSize / 2;
            board.selectedPiece.yPos = e.getY() - board.squareSize / 2;

            board.repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int col = e.getX() / board.squareSize;
        int row = e.getY() / board.squareSize;
        if (board.selectedPiece != null) {
            Move move = new Move(board, board.selectedPiece, col, row);
            if (board.isValidMove(move) && count % 2 == 0 && board.selectedPiece.isWhite) {
                board.makeMove(move);
                if (board.selectedPiece.name == "Pawn" && board.selectedPiece.isWhite && row == 0) {
                    PromotionWindow promotionWindow = new PromotionWindow(col, row, board);

                } else if (board.selectedPiece.name == "Pawn" && !board.selectedPiece.isWhite && row == 7) {
                    PromotionWindow promotionWindow = new PromotionWindow(col, row, board);

                }
                count++;
            } else if (board.isValidMove(move) && count % 2 != 0 && !board.selectedPiece.isWhite) {
                board.makeMove(move);
                if (board.selectedPiece.name == "Pawn" && board.selectedPiece.isWhite && row == 0) {
                    PromotionWindow promotionWindow = new PromotionWindow(col, row, board);

                } else if (board.selectedPiece.name == "Pawn" && !board.selectedPiece.isWhite && row == 7) {
                    PromotionWindow promotionWindow = new PromotionWindow(col, row, board);

                }
                count++;
            } else {
                board.selectedPiece.xPos = board.selectedPiece.col * board.squareSize;
                board.selectedPiece.yPos = board.selectedPiece.row * board.squareSize;

            }
        }
        board.selectedPiece = null;
        board.repaint();


    }

}