package LoginSystem;
import javax.swing.JOptionPane;

import Pieces.Queen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PromotionWindow  implements ActionListener {
    JFrame frame;
    JLayeredPane pane;
    JLabel background;
    JButton queenButton;
    JButton bishopButton;
    JButton knightButton;
    JButton castleButton;
    String pieceString="am";
    private ImageIcon queen = new ImageIcon("bllack queen.png");
    private ImageIcon knight = new ImageIcon("bllack knight.png");
    private ImageIcon bishop = new ImageIcon("whitte bishop.png");
    private ImageIcon castle = new ImageIcon("whitte castle.png");
    private ImageIcon backgroundImage = new ImageIcon("promotion background.png");



    public PromotionWindow(){
        intialize();

    }
//        frame = new JFrame();
//        frame.setLayout(null);
//        frame.setSize(300,300);
//        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
//
//        pane=new JLayeredPane();
//        pane.setLayout(null);
//        pane.setBounds(0,0,300,300);
//
//        background = new JLabel();
//        background.setBounds(0,0,300,300);
//        background.setIcon(backgroundImage);
//        background.setOpaque(true);
//
//
//
//
//
//        pane.add(background);
//        frame.add(pane);
//
//
//
//
//
//
//
//
//
//
//        frame.setVisible(true);

        public void intialize(){


        frame=new JFrame("PawnHackers Chess");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setSize(300,320);

        //frame.setSize(300,300);

        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        ImageIcon icon=new ImageIcon("logo.png");
        frame.setIconImage(icon.getImage());
        pane=new JLayeredPane();
        pane.setBounds(0,0,300,300);
        frame.add(pane);
        ImageIcon image=new ImageIcon("promotion background.png");
        background=new JLabel();
        background.setOpaque(true);
        background.setBounds(0,0,300,300);


        bishopButton = new JButton();
        bishopButton.setBounds(75,93,60,60);
        bishopButton.setIcon(bishop);
        bishopButton.setBackground(new Color(251,215,138,255));
        bishopButton.setBorderPainted(false);
        bishopButton.setFocusable(false);
        bishopButton.setContentAreaFilled(false);
        bishopButton.addActionListener(this);

        queenButton = new JButton();
        queenButton.setBounds(165,93,60,60);
        queenButton.setIcon(queen);
        queenButton.setBackground(new Color(251,215,138,255));
        queenButton.setBorderPainted(false);
        queenButton.setFocusable(false);
        queenButton.setContentAreaFilled(false);
        queenButton.addActionListener(this);


        knightButton = new JButton();
        knightButton.setBounds(75,183,60,60);
        knightButton.setIcon(knight);
        knightButton.setBackground(new Color(251,215,138,255));
        knightButton.setBorderPainted(false);
        knightButton.setFocusable(false);
        knightButton.setContentAreaFilled(false);
        knightButton.addActionListener(this);

        castleButton = new JButton();
        castleButton.setBounds(165,183,60,60);
        castleButton.setIcon(castle);
        castleButton.setBackground(new Color(251,215,138,255));
        castleButton.setBorderPainted(false);
        castleButton.setFocusable(false);
        castleButton.setContentAreaFilled(false);
        castleButton.addActionListener(this);



        pane.add(knightButton);
        pane.add(castleButton);
        pane.add(queenButton);
        pane.add(bishopButton);
        pane.add(background);
        frame.setVisible(true);
        background.setIcon(image);



    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bishop){
            pieceString="bishop";
            frame.dispose();
        }
        else if(e.getSource()==queen){
            pieceString="queen";
            frame.dispose();
        }
        else if(e.getSource()==knight){
            pieceString="bishop";
            frame.dispose();
        }
        else{
            pieceString="castle";
            frame.dispose();
        }
    }

    public String getPieceString() {
        frame.setVisible(true);
        return pieceString;
    }
}

