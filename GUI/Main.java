import javax.swing.*;

public class Main {
    public static void main(String []args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
<<<<<<< HEAD
                //Players frame1=new Players();
                Login frame2=new Login();
                //Board frame3= new Board();
                //trial frame4=new trial();
=======
                Board frame1= new Board();
                Players frame2=new Players();
                Login frame3=new Login();

>>>>>>> 17c8773eec8655f902767dee7d15c46d3dba803f
            }
        });
    }
}
