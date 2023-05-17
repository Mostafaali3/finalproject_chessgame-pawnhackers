package LoginSystem;

import Main.BoardGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameStatues implements ActionListener {
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
    private Person person;
    private String gameStatues;
    private BoardGui boardGui;

    public GameStatues(Person person,String gameStatues,BoardGui boardGui){
        this.person=person;
        this.gameStatues=gameStatues;
        this.boardGui=boardGui;

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
        reloadButton.addActionListener(this);
        ImageIcon reloadIcon = new ImageIcon("reload.png");
        reloadButton.setIcon(reloadIcon);
        reloadButton.setBounds(140,486,158,29);
        reloadButton.setBorderPainted(false);


        backButton = new JButton();
        pane.add(backButton);
        backButton.addActionListener(this);
        ImageIcon backIcon = new ImageIcon("back to main.png");
        backButton.setIcon(backIcon);
        backButton.setBounds(421,486,158,29);
        backButton.setBorderPainted(false);

        exitButton =new JButton();
        pane.add(exitButton);
        exitButton.addActionListener(this);
        ImageIcon exitIcon = new ImageIcon("exit.png");
        exitButton.setIcon(exitIcon);
        exitButton.setBounds(702,486,158,29);
        exitButton.setBorderPainted(false);


        winnerLabel =new JLabel(person.playerName+" WINS !");
        winnerLabel.setBounds(335,200,330,68);
        winnerLabel.setFont(new Font("Bayon",Font.BOLD,25));
        winnerLabel.setForeground(new Color(39,69,129,255));
        winnerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        pane.add(winnerLabel);

        player1Label=new JLabel(boardGui.getPlayer1().getPlayerName());
        player1Label.setBounds(372,291,113,20);
        player1Label.setFont(new Font("Bayon",Font.BOLD,15));
        player1Label.setForeground(new Color(39,69,129,255));
        pane.add(player1Label);

        player2Label =new JLabel(boardGui.getPlayer2().getPlayerName());
        player2Label.setBounds(563,291,113,20);
        player2Label.setFont(new Font("Bayon",Font.BOLD,15));
        player2Label.setForeground(new Color(39,69,129,255));
        pane.add(player2Label);

        eatenPieces1 =new JLabel(Integer.toString(boardGui.getPlayer1().getEatenPieces()));
        eatenPieces1.setBounds(345,349,113,20);
        eatenPieces1.setFont(new Font("Bayon",Font.BOLD,15));
        eatenPieces1.setForeground(new Color(39,69,129,255));
        pane.add(eatenPieces1);

        eatenPieces2 =new JLabel(Integer.toString(boardGui.getPlayer2().getEatenPieces()));
        eatenPieces2.setBounds(535,349,113,20);
        eatenPieces2.setFont(new Font("Bayon",Font.BOLD,15));
        eatenPieces2.setForeground(new Color(39,69,129,255));
        pane.add(eatenPieces2);

        winStateLabel =new JLabel(gameStatues);
        winStateLabel.setBounds(335,251,330,18);
        winStateLabel.setFont(new Font("Bayon",Font.BOLD,15));
        winStateLabel.setForeground(new Color(39,69,129,255));
        winStateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        pane.add(winStateLabel);





        pane.add(backgroundLabel);







        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==reloadButton){
            frame.dispose();
            boardGui.getPlayer1().setEatenPieces();
            boardGui.getPlayer2().setEatenPieces();
            BoardGui boardGui1=new BoardGui(boardGui.getPlayer1(), boardGui.getPlayer2());
        }
        if(e.getSource()==exitButton){
            frame.dispose();
            System.exit(0);
        }
        if(e.getSource()==backButton){
            frame.dispose();
            IDandPasswords idandPasswords = new IDandPasswords();
            Login login=new Login(idandPasswords.getLoginInfo());
        }
    }
}

