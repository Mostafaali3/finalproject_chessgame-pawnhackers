package Main;

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






    ArrayList<Piece> pieceList= new ArrayList<>();
    Input input =new Input(this);
    public int squareSize = 60;
    int rows=8;
    int cols = 8;
    public Board(){
        this.setPreferredSize(new Dimension(cols*squareSize,rows*squareSize));
        this.addMouseListener(input);
        this.addMouseMotionListener(input);
        addPieces();



//        frame=new JFrame("PawnHackers Chess");
//        panel=new JLayeredPane();
//        frame.add(panel);
//        panel.setBounds(0,0,1012,636);
//        frame.setSize(1012,636);
//        frame.setVisible(true);
//        frame.setResizable(false);
//        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//        frame.setLocationRelativeTo(null);
//        ImageIcon image = new ImageIcon("Logo.png");
//        frame.setIconImage(image.getImage());
//        frame.setLayout(null);
//
//
//
//
//
//        name1=new JLabel("Player 1's Time:");
//        name1.setHorizontalAlignment(SwingConstants.CENTER);
//        name1.setFont(new Font("Bayon",Font.BOLD,15));
//        name1.setForeground(new Color(39,69,129,255));
//        name1.setBounds(35,460,145,40);
//        panel.add(name1);
//
//        name2=new JLabel("Player 2's Time:");
//        name2.setHorizontalAlignment(SwingConstants.CENTER);
//        name2.setFont(new Font("Bayon",Font.BOLD,15));
//        name2.setForeground(new Color(39,69,129,255));
//        name2.setBounds(819,460,145,40);
//        panel.add(name2);
//
//        time1=new JLabel("05:00");
//        time1.setHorizontalAlignment(SwingConstants.CENTER);
//        time1.setFont(new Font("Bayon",Font.BOLD,20));
//        time1.setForeground(new Color(39,69,129,255));
//        time1.setBounds(70,510,76,40);
//        panel.add(time1);
//
//        time2=new JLabel("05:00");
//        time2.setHorizontalAlignment(SwingConstants.CENTER);
//        time2.setFont(new Font("Bayon",Font.BOLD,20));
//        time2.setForeground(new Color(39,69,129,255));
//        time2.setBounds(854,510,76,40);
//        panel.add(time2);


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

//    public void setPiece(int col,int row) {
//        for(Piece piece : pieceList)
//        {
//            if(piece.col==col&&piece.row==row)
//            {
//                pieceList.set()
//            }
//        }
//        return null;
//
//    }

    public void makeMove(Move move) {
        move.piece.col = move.newCol;
        move.piece.row = move.newRow;
        move.piece.xPos = move.newCol*squareSize;
        move.piece.yPos = move.newRow*squareSize;
        move.piece.isFirstMove=false;
        capture(move);


    }

    public void capture(Move move){
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

    public boolean sameTeam(Piece p1,Piece p2){
        if(p1==null||p2==null)
        {return false;}
        return p1.isWhite== p2.isWhite;


    }



}
