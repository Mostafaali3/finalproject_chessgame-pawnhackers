package Main;

import LoginSystem.PromotionWindow;
import Pieces.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;

public class Board extends JPanel {


//    private JFrame frame;
//    private JLayeredPane panel;
//    private JLabel label;
//    private JPanel board;
//    private JPanel square;
//    private JLabel labelSquare;
//    private JLabel time1;
//    private JLabel time2;
//    private JLabel name1;
//    private JLabel name2;


     public ArrayList<Piece> pieceList= new ArrayList<>();
     public ArrayList<Piece> eatenWhite =new ArrayList<>();
     public ArrayList<Piece> eatenBlack =new ArrayList<>();
     BoardGui boardGui;

    Input input =new Input(this);
    public int squareSize = 60;
    int rows=8;
    int cols = 8;
    public Board(BoardGui boardGui){
        this.setPreferredSize(new Dimension(cols*squareSize,rows*squareSize));
        this.addMouseListener(input);
        this.addMouseMotionListener(input);
        this.boardGui=boardGui;
        addPieces();




    }



    public void addPieces(){


        pieceList.add(new Knight(this,6,0,false));
        pieceList.add(new Knight(this,1,0,false));
        pieceList.add(new Knight(this,6,7,true));
        pieceList.add(new Knight(this,1,7,true));

        pieceList.add(new King(this,4,0,false));
        pieceList.add(new King(this,4,7,true));

        pieceList.add(new Queen(this,3,0,false));
        pieceList.add(new Queen(this,3,7,true));

        pieceList.add(new Bishop(this,2,0,false));
        pieceList.add(new Bishop(this,5,0,false));
        pieceList.add(new Bishop(this,2,7,true));
        pieceList.add(new Bishop(this,5,7,true));

        pieceList.add(new Castle(this,0,0,false));
        pieceList.add(new Castle(this,7,0,false));
        pieceList.add(new Castle(this,0,7,true));
        pieceList.add(new Castle(this,7,7,true));


        for(int col=0;col<8;col++){
            pieceList.add(new Pawn(this,col,1,false));
            pieceList.add(new Pawn(this,col,6,true));
        }
    }


    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        for(int r=0;r<rows;r++)
            for(int c=0;c<cols;c++)
            {
                g2d.setColor((c+r)%2==0 ? new Color(39,69,129,255) :new Color(251,215,138,255) );
                g2d.fillRect(c*squareSize,r*squareSize,squareSize,squareSize);

            }
        if(selectedPiece!=null)
        for(int r=0;r<rows;r++)
            for(int c=0;c<cols;c++)
            {

                if(notvalid(new Move(this,selectedPiece,c,r))) {

                    g2d.setColor(new Color(208, 9, 40, 190));
                    g2d.fillRect(c * squareSize, r * squareSize, squareSize, squareSize);

                }
                if(isValidMove(new Move(this,selectedPiece,c,r))) {
                   g2d.setColor(new Color(73, 186, 25,190));
                   g2d.fillRect(c*squareSize,r*squareSize,squareSize,squareSize);

                }




            }

        for(Piece piece : pieceList)
        {
            piece.paint(g2d);
        }

    }


    protected Piece selectedPiece;
    public Piece getPiece(int col,int row) {
        for(Piece piece : pieceList)
        {
            if(piece.col==col&&piece.row==row)
            {
                return piece;
            }
        }
        return null;

    }


//    public void moveking(Move move  ) {
////       Piece Castle;
////       Piece king;
////        if(King.iscastled(move.newCol, move.newRow)==true&&Math.abs(move.piece.col-move.newCol)==2){
////            Castle=getPiece(7,move.piece.col);
////            Castle.col=5;
////
////
////}
//
//        if(Math.abs(move.piece.col-move.newCol)==2){
//            Piece Castle;
//            if(move.piece.col<move.newCol){
//                Castle=getPiece(7,move.piece.row);
//                Castle.col=5;
//            }
//            else{
//
//               Castle=getPiece(0,move.piece.row);
//               Castle.col=3;
//            }
//            Castle.xPos= Castle.col*squareSize;
//        }
//
//
//    }

    public void promotion(int col,int row,String pieceName) {
        int i=0;
//        String pieceName=JOptionPane.showInputDialog("Enter the piece to be promoted to");
//        pieceName=pieceName.toLowerCase();
        for(Piece piece : pieceList)
        {

            if(piece.col==col&&piece.row==row)
            {
                if(!piece.isWhite){
                    if(pieceName.equals("queen")){
                        pieceList.set(i,new Queen(this,col,row,false));}
                    else if(pieceName.equals("bishop")){
                        pieceList.set(i,new Bishop(this,col,row,false));}
                    else if(pieceName.equals("knight")){
                        pieceList.set(i,new Knight(this,col,row,false));}
                    else if(pieceName.equals("castle")){
                        pieceList.set(i,new Castle(this,col,row,false));}
                    else{
                        pieceList.set(i,new Queen(this,col,row,false));}
                }
                else{

                    if(pieceName.equals("queen")){
                        pieceList.set(i,new Queen(this,col,row,true));}
                    else if(pieceName.equals("bishop")){
                        pieceList.set(i,new Bishop(this,col,row,true));}
                    else if(pieceName.equals("knight")){
                        pieceList.set(i,new Knight(this,col,row,true));}
                    else if(pieceName.equals("castle")){
                        pieceList.set(i,new Castle(this,col,row,true));}
                    else{
                        pieceList.set(i,new Queen(this,col,row,true));}
                }
            }
            i++;
        }

    }

    public void castling() {
        for (Piece piece1 : pieceList) {
            if (piece1.col == 7 && piece1.row == 0&&piece1.name.equals("Castle")&&piece1.movesCounter==0 && !piece1.isWhite&&this.getPiece(6,0)!=null) {
                if (!this.getPiece(6, 0).isWhite && this.getPiece(6, 0).name.equals("King")) {
                    this.makeMove(new Move(this, piece1, 5, 0));
                    this.repaint();
                    break;
                }
            }
            else if (piece1.col == 7 && piece1.row == 7&&piece1.name.equals("Castle")&&piece1.movesCounter==0&& piece1.isWhite&&this.getPiece(6,7)!=null) {
                if(this.getPiece(6,7).isWhite&&this.getPiece(6,7).name.equals("King")){
                    this.makeMove(new Move(this,piece1,5,7));
                    this.repaint();
                    break;
                }
            }
            else if (piece1.col == 0 && piece1.row == 7&&piece1.name.equals("Castle")&&piece1.movesCounter==0&& piece1.isWhite&&this.getPiece(2,7)!=null) {
                if(this.getPiece(2,7).isWhite&&this.getPiece(2,7).name.equals("King")){
                    this.makeMove(new Move(this,piece1,3,7));
                    this.repaint();
                    break;
                }
            }
            else if (piece1.col == 0 && piece1.row == 0&&piece1.name.equals("Castle")&&piece1.movesCounter==0 && !piece1.isWhite&&this.getPiece(2,0)!=null) {
                if (!this.getPiece(2, 0).isWhite && this.getPiece(2, 0).name.equals("King")) {
                    this.makeMove(new Move(this, piece1, 3, 0));
                    this.repaint();
                    break;
                }
            }

        }}




    public void makeMove(Move move) {
//        if(move.piece.name.equals(("king"))){
//            moveking((move));
//        }
        move.piece.col = move.newCol;
        move.piece.row = move.newRow;
        move.piece.xPos = move.newCol*squareSize;
        move.piece.yPos = move.newRow*squareSize;
        move.piece.isFirstMove=false;
        move.piece.movesCounter++;
        capture(move);


    }

    public void capture(Move move){
        if (move.capture!=null){
                    if(move.capture.isWhite){
            eatenWhite.add(move.capture);
            boardGui.displayDeadPieces(move.capture.isWhite,move.capture.name);
        }
        else{
            eatenBlack.add(move.capture);
            boardGui.displayDeadPieces(move.capture.isWhite,move.capture.name);
        }
        }

        pieceList.remove(move.capture);

    }
    public boolean isValidMove(Move move){
        if (sameTeam(move.piece,move.capture))
        {
            return false;
        }
        if(!move.piece.isvalidmovement(move.newCol,move.newRow)){return false;}
        if(move.piece.movecollideswithpiece(move.newCol,move.newRow)){return false;}

        return true;
    }

    //for red square
    public boolean notvalid(Move move){


        if(!((move.capture!=null)&&(move.piece!=null)&&(move.capture.isWhite==move.piece.isWhite))){return false;}
        if(move.piece.movecollideswithpiece(move.newCol,move.newRow)){return false;}
        if(!move.piece.isvalidmovement(move.newCol,move.newRow)){return false;}
if (move.piece==move.capture){return false;}


        return true;

    }


    public boolean sameTeam(Piece p1,Piece p2){
        if(p1==null||p2==null)
        {return false;}
        return p1.isWhite== p2.isWhite;


    }

//    public boolean isCheckMated(int col,int row,Piece king){
//        for(Piece piece : pieceList)
//        {
//            if(!this.sameTeam(king,piece))
//            {
//                if(piece.isvalidmovement(col,row)&&((king.col-1==col&&king.row+1==row))){
//                    return true;
//                    //&&((king.col+1==col&&king.row+1==row)||(king.col-1==col&&king.row+1==row)||(king.col-1==col&&king.row-1==row)||(king.col+1==col&&king.row-1==row))
//                    //(king.col==col||king.col+1==col||king.col-1==col)&&(king.row==row||king.row+1==row||king.row-1==row)&&!((king.row==row)&&(king.col==col))
//                }
//                if (piece.isvalidmovement(col,row)&&((king.col==col&&king.row+1==row))){
//                    return true;
//                }
//
//            }
//        }
//        return false;
//
//
//
//    }





}
