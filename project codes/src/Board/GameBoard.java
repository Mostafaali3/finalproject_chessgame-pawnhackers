package Board;

import GuiFrames.Board;
import Pieces.Army;
import Pieces.PieceColor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameBoard extends JPanel {
    public static final int LENGTH=8;
    private Army whiteArmy;
    private Army blackArmy;
    private Square[][] squares;
    public GameBoard(Army whiteArmy, Army blackArmy){
        this.whiteArmy=whiteArmy;
        this.blackArmy=blackArmy;
        squares = new Square[LENGTH][LENGTH];
        for(int r=0;r<LENGTH;r++){
            for(int c=0;c<LENGTH;c++){
                squares[r][c] = new Square(this,r,c);
            }
        }

    }

    public Army getArmy(PieceColor color){
        if (color==PieceColor.WHITE)
            return whiteArmy;
        else
            return blackArmy;
    }

    public Square getSquare(int row , int col){
        return squares[row][col];
    }


















    /*JLabel labelSquare;
    JLabel[][] squaresXY=new JLabel[9][9];

    public GameBoard (){
        setBounds(260,60,480,480);
        //setBackground(null);
        setLayout(new GridLayout(8,8));

        for (int i = 0; i <64; i++) {
            //JPanel square = new JPanel();
            JLabel labelSquare =new JLabel();
            //labelSquare.setBackground(null);
            labelSquare.setSize(60,60);
//            labelSquare.setVerticalAlignment(JLabel.CENTER);
            labelSquare.setBorder(BorderFactory.createEtchedBorder());
            if ((i / 8) % 2 == 0) {
                if (i % 2 == 0) {
                    labelSquare.setBackground(new Color(251, 215, 138,255));
                    labelSquare.setOpaque(true);
                    labelSquare.addMouseListener(this);
                } else {
                    labelSquare.setBackground(new Color(39, 69, 129,255));
                    labelSquare.setOpaque(true);
                    labelSquare.addMouseListener(this);
                }
            } else {
                if (i % 2 == 0) {
                    labelSquare.setBackground(new Color(39, 69, 129,255));
                    labelSquare.setOpaque(true);
                    labelSquare.addMouseListener(this);
                } else {
                    labelSquare.setBackground(new Color(251, 215, 138,255));
                    labelSquare.setOpaque(true);
                    labelSquare.addMouseListener(this);
                }
            }
            //addPiece(i);
            //square.add(labelSquare);
            squaresXY[(i%8)][i/8]=labelSquare;
            System.out.println("x="+((i%8))+"     y="+(i/8));
            add(labelSquare);
        }
        //squaresXY[0][1].setBackground(Color.GREEN);*/




    //}


}
