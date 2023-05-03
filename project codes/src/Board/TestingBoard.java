package Board;

import GuiFrames.Board;

import javax.swing.*;
import java.awt.*;

public class TestingBoard {
     public static void main(String[] args) {
         System.setProperty("sun.java2d.uiScale","1.0");
         JFrame frame = new JFrame();
         frame.setSize(1000,636);
         frame.setLocationRelativeTo(null);
         frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
         frame.setResizable(false);



         JLayeredPane pane = new JLayeredPane();
         pane.setBounds(0,0,1000,636);
         frame.add(pane);

         //JPanel board = new GameBoard();




         //pane.add(board);
         frame.setVisible(true);

    }
}
