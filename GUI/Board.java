import javax.swing.*;
import javax.swing.*;
import java.awt.*;

public class Board
{
    private JFrame frame;
    private JLayeredPane panel;
    private JLabel label;
    private JPanel board;
    private JPanel square;
    private JLabel labelSquare;
    private JLabel time1;
    private JLabel time2;
    private JLabel name1;
    private JLabel name2;
    private ImageIcon whiteBishop=new ImageIcon("white bishop.png");
    private ImageIcon whiteCastle=new ImageIcon("white castle.png");
    private ImageIcon whiteking=new ImageIcon("white king.png");
    private ImageIcon whiteknight=new ImageIcon("white knight.png");
    private ImageIcon whitePawn=new ImageIcon("white pawn.png");
    private ImageIcon whiteQueen=new ImageIcon("white queen.png");
    private ImageIcon blackBishop=new ImageIcon("black bishop.png");
    private ImageIcon blackCastle=new ImageIcon("black castle.png");
    private ImageIcon blackking=new ImageIcon("black king.png");
    private ImageIcon blackknight=new ImageIcon("black knight.png");
    private ImageIcon blackPawn=new ImageIcon("black pawn.png");
    private ImageIcon blackQueen=new ImageIcon("black queen.png");


    public Board() {
        initialize();
    }

    private void initialize() {

        frame=new JFrame("PawnHackers Chess");
        panel=new JLayeredPane();
        frame.add(panel);
        panel.setBounds(0,0,Login.frameWidth,Login.frameHeight);
        frame.setSize(Login.frameWidth, Login.frameHeight);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        ImageIcon image = new ImageIcon("Logo.png");
        frame.setIconImage(image.getImage());
        frame.setLayout(null);





        name1=new JLabel("Player 1's Time:");
        name1.setHorizontalAlignment(SwingConstants.CENTER);
        name1.setFont(new Font("Bayon",Font.BOLD,15));
        name1.setForeground(new Color(39,69,129,255));
        name1.setBounds(35,460,145,40);
        panel.add(name1);

        name2=new JLabel("Player 2's Time:");
        name2.setHorizontalAlignment(SwingConstants.CENTER);
        name2.setFont(new Font("Bayon",Font.BOLD,15));
        name2.setForeground(new Color(39,69,129,255));
        name2.setBounds(819,460,145,40);
        panel.add(name2);

        time1=new JLabel("05:00");
        time1.setHorizontalAlignment(SwingConstants.CENTER);
        time1.setFont(new Font("Bayon",Font.BOLD,20));
        time1.setForeground(new Color(39,69,129,255));
        time1.setBounds(70,510,76,40);
        panel.add(time1);

        time2=new JLabel("05:00");
        time2.setHorizontalAlignment(SwingConstants.CENTER);
        time2.setFont(new Font("Bayon",Font.BOLD,20));
        time2.setForeground(new Color(39,69,129,255));
        time2.setBounds(854,510,76,40);
        panel.add(time2);


        board = new JPanel(new GridLayout(8, 8));
        board.setBounds(260,60,480,480);
        frame.add(board);
        for (int i = 0; i < 64; i++) {
            square = new JPanel();
            labelSquare =new JLabel();
            labelSquare.setBackground(null);
            labelSquare.setSize(60,60);
//            labelSquare.setVerticalAlignment(JLabel.CENTER);
            square.setBorder(BorderFactory.createEtchedBorder());
            if ((i / 8) % 2 == 0) {
                if (i % 2 == 0) {
                    square.setBackground(new Color(251, 215, 138,255));
                } else {
                    square.setBackground(new Color(39, 69, 129,255));
                }
            } else {
                if (i % 2 == 0) {
                    square.setBackground(new Color(39, 69, 129,255));
                } else {
                    square.setBackground(new Color(251, 215, 138,255));
                }
            }
            addPiece(i);
            square.add(labelSquare);
            board.add(square);
        }
        board.setVisible(true);
        panel.add(board);
        label = new JLabel();
        panel.add(label);
        label.setOpaque(true);
        label.setBounds(0, 0, 1000, 600);
        ImageIcon image2 = new ImageIcon("board page.png");
        label.setIcon(image2);
    }

    private void addPiece(int squareNumber){

        if(squareNumber==0||squareNumber==7){
            this.labelSquare.setIcon(blackCastle);
            this.labelSquare.setOpaque(true);
        }
        if(squareNumber==56||squareNumber==63){
            this.labelSquare.setIcon(whiteCastle);
            this.labelSquare.setOpaque(true);
        }
        if(squareNumber>=8&&squareNumber<=15){
            labelSquare.setIcon(blackPawn);
            this.labelSquare.setOpaque(true);
        }
        if(squareNumber>=48&&squareNumber<=55){
            labelSquare.setIcon(whitePawn);
            this.labelSquare.setOpaque(true);
        }
        if(squareNumber==1||squareNumber==6){
            labelSquare.setIcon(blackknight);
            this.labelSquare.setOpaque(true);
        }
        if(squareNumber==57||squareNumber==62){
            labelSquare.setIcon(whiteknight);
            this.labelSquare.setOpaque(true);
        }
        if(squareNumber==2||squareNumber==5){
            labelSquare.setIcon(blackBishop);
            this.labelSquare.setOpaque(true);
        }
        if(squareNumber==58||squareNumber==61){
            labelSquare.setIcon(whiteBishop);
            this.labelSquare.setOpaque(true);
        }
        if(squareNumber==3){
            labelSquare.setIcon(blackQueen);
            this.labelSquare.setOpaque(true);
        }
        if(squareNumber==59){
            labelSquare.setIcon(whiteQueen);
            this.labelSquare.setOpaque(true);
        }
        if(squareNumber==4){
            labelSquare.setIcon(blackking);
            this.labelSquare.setOpaque(true);
        }
        if(squareNumber==60){
            labelSquare.setIcon(whiteking);
            this.labelSquare.setOpaque(true);
        }
    }
}

