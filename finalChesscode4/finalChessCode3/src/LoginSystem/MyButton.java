package LoginSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButton extends JButton {
    public int index;


    public MyButton(int index){
        this.index = index;
        //this.setContentAreaFilled(false);
        this.setBackground(new Color(217,217,217));
        this.setBorderPainted(false);
        setFocusable(false);
//        this.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                //setBackground(new Color(217,217,217));
//                setContentAreaFilled(false);
//            }
//        });



    }



}
