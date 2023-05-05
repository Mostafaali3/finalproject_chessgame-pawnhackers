package Main;

import LoginSystem.IDandPasswords;
import LoginSystem.Login;
import LoginSystem.PromotionWindow;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                System.setProperty("sun.java2d.uiScale","1.0");
//                IDandPasswords idandPasswords = new IDandPasswords();
//
//                Login loginPage = new Login(idandPasswords.getLoginInfo());
                PromotionWindow window = new PromotionWindow();
//                BoardGui gui = new BoardGui();



            }
        });
//        JFrame frame= new JFrame();
//        //frame.getContentPane().setBackground(Color.BLACK);
//        frame.setLayout(new GridBagLayout());
//        frame.setMinimumSize(new Dimension(1000,636));
//        frame.setLocationRelativeTo(null);
//
//        Board board= new Board();
//        frame.add(board);
//
//
//
//        frame.setVisible(true);

    }
}