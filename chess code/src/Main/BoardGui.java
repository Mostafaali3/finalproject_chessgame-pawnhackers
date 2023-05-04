package Main;

import Pieces.Knight;
import Pieces.Piece;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class BoardGui extends JLayeredPane {
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
    private JPanel newPanel;




    public BoardGui() {
//


        frame=new JFrame("PawnHackers Chess");
        panel=new JLayeredPane();
        frame.add(panel);
        panel.setBounds(0,0,1012,645);

        frame.setSize(1012,645);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        ImageIcon image = new ImageIcon("Logo.png");
        frame.setIconImage(image.getImage());
        frame.setLayout(null);

        Board board1 = new Board();
        //panel.add(board1);

        newPanel = new JPanel();
        newPanel.setBounds(260,60,480,480);
        newPanel.setLayout(new GridBagLayout());
        newPanel.add(board1);
        panel.add(newPanel);



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




        label = new JLabel();
        panel.add(label);
        label.setOpaque(true);
        label.setBounds(0, 0, 1000, 600);
        ImageIcon image2 = new ImageIcon("board.png");
        label.setIcon(image2);

        }


}
