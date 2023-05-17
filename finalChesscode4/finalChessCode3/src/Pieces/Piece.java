package Pieces;

import Main.Board;
import Main.BoardGui;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Piece {
    public int row,col;
    public int xPos,yPos;
    public boolean isWhite;
    public String name;
    public int value;
    ImageIcon image;
    Image sprite;
    Board board;
    public boolean isFirstMove=true;
    public int movesCounter;

//    BufferedImage sheet;
//    {
//        try {
//            sheet = ImageIO.read(ClassLoader.getSystemResourceAsStream("Chess pieces.png"));
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }

//    protected int sheetScale = sheet.getWidth()/6;

    public Piece(Board board){
        this.board=board;
        this.movesCounter=0;

    }
    public boolean isvalidmovement(int col, int row){ return true;}
    public boolean movecollideswithpiece(int col, int row){ return false;}
    public boolean isChecked (){return false;}




    public void paint(Graphics2D g2d)
    {
        g2d.drawImage(sprite,xPos,yPos,null);
    }






}
