import javax.swing.*;

public class Main {
    public static void main(String []args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                System.setProperty("sun.java2d.uiScale","1.0");
                //com.formdev.flatlaf.FlatDarkLaf.install();
                GameStatus frame4=new GameStatus();
                Board frame1= new Board();
                Players frame2=new Players();
                Login frame3=new Login();





            }
        });
    }
}
