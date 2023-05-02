package GuiFrames;

import javax.swing.*;
import java.awt.*;

public class GameStatus {
    private JFrame frame;
    private JButton reloadButton;
    private JButton backButton;
    private JButton exitButton;
    private JLayeredPane pane;
    private JLabel backgroundLabel;
    private JLabel player1Label;
    private JLabel player2Label;
    private JLabel winnerLabel;
    private JLabel eatenPieces1;
    private JLabel eatenPieces2;
    private JLabel winStateLabel;

    public GameStatus(){
        initialize();
    }
    private void initialize(){

        frame = new JFrame("PawnHackers Chess");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(Login.frameWidth, Login.frameHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        ImageIcon icon = new ImageIcon("logo.png");
        frame.setIconImage(icon.getImage());
        pane = new JLayeredPane();
        pane.setBounds(0, 0,Login.frameWidth,Login.frameHeight);
        frame.add(pane);

        ImageIcon image = new ImageIcon("status page no buttons.png");

        backgroundLabel = new JLabel();
        backgroundLabel.setOpaque(true);
        backgroundLabel.setBounds(0,0,1000,600);
        backgroundLabel.setIcon(image);

        reloadButton = new JButton();
        pane.add(reloadButton);
        ImageIcon reloadIcon = new ImageIcon("reload.png");
        reloadButton.setIcon(reloadIcon);
        reloadButton.setBounds(140,486,158,29);
        reloadButton.setBorderPainted(false);


        backButton = new JButton();
        pane.add(backButton);
        ImageIcon backIcon = new ImageIcon("back to main.png");
        backButton.setIcon(backIcon);
        backButton.setBounds(421,486,158,29);
        backButton.setBorderPainted(false);

        exitButton =new JButton();
        pane.add(exitButton);
        ImageIcon exitIcon = new ImageIcon("exit.png");
        exitButton.setIcon(exitIcon);
        exitButton.setBounds(702,486,158,29);
        exitButton.setBorderPainted(false);


        winnerLabel =new JLabel("PLAYER 1 WINS !");
        winnerLabel.setBounds(335,200,330,68);
        winnerLabel.setFont(new Font("Bayon",Font.BOLD,25));
        winnerLabel.setForeground(new Color(39,69,129,255));
        winnerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        pane.add(winnerLabel);

        player1Label=new JLabel("player1");
        player1Label.setBounds(372,291,113,20);
        player1Label.setFont(new Font("Bayon",Font.BOLD,15));
        player1Label.setForeground(new Color(39,69,129,255));
        pane.add(player1Label);

        player2Label =new JLabel("player2");
        player2Label.setBounds(563,291,113,20);
        player2Label.setFont(new Font("Bayon",Font.BOLD,15));
        player2Label.setForeground(new Color(39,69,129,255));
        pane.add(player2Label);

        eatenPieces1 =new JLabel("5");
        eatenPieces1.setBounds(345,349,113,20);
        eatenPieces1.setFont(new Font("Bayon",Font.BOLD,15));
        eatenPieces1.setForeground(new Color(39,69,129,255));
        pane.add(eatenPieces1);

        eatenPieces2 =new JLabel("4");
        eatenPieces2.setBounds(535,349,113,20);
        eatenPieces2.setFont(new Font("Bayon",Font.BOLD,15));
        eatenPieces2.setForeground(new Color(39,69,129,255));
        pane.add(eatenPieces2);

        winStateLabel =new JLabel("checkmate");
        winStateLabel.setBounds(335,251,330,18);
        winStateLabel.setFont(new Font("Bayon",Font.BOLD,15));
        winStateLabel.setForeground(new Color(39,69,129,255));
        winStateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        pane.add(winStateLabel);





        pane.add(backgroundLabel);


        /*reloadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("reloaded");
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("exit");
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("back");
            }
        });*/








        frame.setVisible(true);


    }

}
