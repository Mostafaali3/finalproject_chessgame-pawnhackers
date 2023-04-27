import javax.swing.*;

public class Main {
    public static void main(String []args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Players frame1=new Players();
                //Login frame2=new Login();
            }
        });
    }
}
