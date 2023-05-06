package LoginSystem;

import Main.BoardGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Players implements ActionListener {
    private JFrame frame;
    private JLayeredPane panel;
    private JLabel label;
    private JTextField player1;
    private JTextField player2;
    private JTextField timer;
    private JPasswordField password;
    private JButton set;


    public Players() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("PawnHackers Chess");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(Login.frameWidth, Login.frameHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        ImageIcon icon = new ImageIcon("logo.png");
        frame.setIconImage(icon.getImage());
        panel = new JLayeredPane();
        panel.setBounds(0, 0, 1000, 600);
        frame.add(panel);

        ImageIcon image=new ImageIcon("players page.png");
        label=new JLabel();
        label.setOpaque(true);
        label.setBounds(0,0,1000,600);
        frame.setVisible(true);
        label.setIcon(image);

        player1 =new JTextField("Player1");
        panel.add(player1);
        player1.setBounds(422,244,163,24);
        player1.setBackground(new Color(251,215,138,255));

        player2 =new JTextField("Player2");
        panel.add(player2);
        player2.setBounds(422,300,163,24);
        player2.setBackground(new Color(251,215,138,255));

        timer=new JTextField("5");
        panel.add(timer);
        timer.setBounds(463,397,74,24);
        timer.setBackground(new Color(251,215,138,255));

        set=new JButton();
        panel.add(set);
        ImageIcon setButton=new ImageIcon("set button.png");
        set.setIcon(setButton);
        set.setBounds(450,446,105,29);
        set.setBorderPainted(false);
        set.addActionListener(this);
        panel.add(label);


        set.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Person player1=new Person();
        Person player2=new Person();
        player1.setPlayerName(this.player1.getText());
        player2.setPlayerName(this.player2.getText());
        int timer=Integer.valueOf(this.timer.getText());
        player1.setTimer(timer);
        player2.setTimer(timer);

        BoardGui board=new BoardGui(player1,player2);
        frame.dispose();

    }
}



