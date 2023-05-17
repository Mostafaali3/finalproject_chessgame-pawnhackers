package Main;

import LoginSystem.Login;
import LoginSystem.Players;
import LoginSystem.PromotionWindow;
import Pieces.Piece;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;

public class Input extends MouseAdapter {
    String pieceString=null;
    Board board;
    public int count=0;
    public Input(Board board){
        this.board=board;
    }


    @Override
    public void mousePressed(MouseEvent e) {
        int col = e.getX()/board.squareSize;
        int row = e.getY()/board.squareSize;
        Piece pieceXY= board.getPiece(col,row);
        if(pieceXY!=null)
        {
            board.selectedPiece = pieceXY;
        }
        if(board.isGameEndedForBlack()){
            Login login = new Login(new HashMap<>());
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if(board.selectedPiece!=null)
        {
            board.selectedPiece.xPos = e.getX() - board.squareSize/2;
            board.selectedPiece.yPos = e.getY() - board.squareSize/2;

            board.repaint();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int col = e.getX()/board.squareSize;
        int row = e.getY()/board.squareSize;
        if (board.selectedPiece!=null){
            Move move = new Move(board,board.selectedPiece,col,row);

            //            if(board.isGameEnded(move)){
//                Players players = new Players();
//            }
            if(board.isValidMove(move)){
                board.boardGui.timer2.start();
                board.boardGui.timer1.stop();
                board.makeMove(move);
                if(board.selectedPiece.name=="Pawn"&&board.selectedPiece.isWhite&&row==0){
                    PromotionWindow promotionWindow=new PromotionWindow(col,row,board);
//                    pieceString= JOptionPane.showInputDialog("Enter the piece to be promoted to:");
//                    while (promotionWindow.getPieceString()==null)
//                        board.promotion(col,row);
                }
                else if(board.selectedPiece.name=="Pawn"&&!board.selectedPiece.isWhite&&row==7){
                    PromotionWindow promotionWindow=new PromotionWindow(col,row,board);

//                    while (promotionWindow.getPieceString()==null)
//                        board.promotion(col,row);
                }

            }
            else {
                board.selectedPiece.xPos = board.selectedPiece.col * board.squareSize;
                board.selectedPiece.yPos = board.selectedPiece.row * board.squareSize;

            }
//            if(board.isValidMove(move)&&count%2==0&&board.selectedPiece.isWhite){
//                board.boardGui.timer2.start();
//                board.boardGui.timer1.stop();
//                board.makeMove(move);
//
//                if(board.selectedPiece.name=="Pawn"&&board.selectedPiece.isWhite&&row==0){
//                    PromotionWindow promotionWindow=new PromotionWindow(col,row,board);
////                    pieceString= JOptionPane.showInputDialog("Enter the piece to be promoted to:");
////                    while (promotionWindow.getPieceString()==null)
////                        board.promotion(col,row);
//                }
//                else if(board.selectedPiece.name=="Pawn"&&!board.selectedPiece.isWhite&&row==7){
//                    PromotionWindow promotionWindow=new PromotionWindow(col,row,board);
//
////                    while (promotionWindow.getPieceString()==null)
////                        board.promotion(col,row);
//                }
//                count++;
//                if (board.selectedPiece.name.equals("King")) {
//                    board.castling();
//                }
//            }
//            else if(board.isValidMove(move)&&count%2!=0&&!board.selectedPiece.isWhite){
//                board.boardGui.timer2.stop();
//                board.boardGui.timer1.start();
//                board.makeMove(move);
//
//                if(board.selectedPiece.name=="Pawn"&&board.selectedPiece.isWhite&&row==0){
//                    PromotionWindow promotionWindow=new PromotionWindow(col,row,board);
////                    pieceString= JOptionPane.showInputDialog("Enter the piece to be promoted to:");
////                    while (promotionWindow.getPieceString()==null)
////                        board.promotion(col,row);
//                }
//                else if(board.selectedPiece.name=="Pawn"&&!board.selectedPiece.isWhite&&row==7){
//                    PromotionWindow promotionWindow=new PromotionWindow(col,row,board);
//
////                    while (promotionWindow.getPieceString()==null)
////                        board.promotion(col,row);
//                }
//                count++;
//                if (board.selectedPiece.name.equals("King")) {
//                    board.castling();
//                }
//            }
//            else {
//                board.selectedPiece.xPos = board.selectedPiece.col * board.squareSize;
//                board.selectedPiece.yPos = board.selectedPiece.row * board.squareSize;
//
//            }
        }
        board.selectedPiece=null;
        board.repaint();


    }





}
