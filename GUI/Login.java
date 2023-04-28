import javax.swing.*;
import java.awt.*;

public class Login {
    private JFrame frame;
    private JLayeredPane panel;
    private JLabel label;
    private JTextField userName;
    private JPasswordField password;
    private JButton login;
    private JButton guest;
    public static int frameWidth=1012;
    public static int frameHeight=639;

    public Login(){
        initialize();
    }
    private void initialize (){
        frame=new JFrame("PawnHackers Chess");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(frameWidth,frameWidth);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        ImageIcon icon=new ImageIcon("logo.png");
        frame.setIconImage(icon.getImage());
        panel=new JLayeredPane();
        panel.setBounds(0,0,1000,600);
        frame.add(panel);
        ImageIcon image=new ImageIcon("login page.jpg");
        label=new JLabel();
        label.setOpaque(true);
        label.setBounds(0,0,1000,600);

        userName =new JTextField(10);
        userName.setBounds(510,260,200,30);
        //userName.setBackground(new Color(251,215,138,255));

        password=new JPasswordField();
        password.setBounds(510,322,200,30);
        //password.setBackground(new Color(251,215,138,255));
        password.setOpaque(true);

        login=new JButton();
        panel.add(login);
        guest=new JButton();
        panel.add(guest);
        ImageIcon loginButton=new ImageIcon("login button.png");
        login.setIcon(loginButton);
        login.setBounds(500,405,105,29);
        login.setBorderPainted(false);
        ImageIcon guestButton=new ImageIcon("guest button.png");
        guest.setIcon(guestButton);
        guest.setBounds(653,405,105,29);
        guest.setBorderPainted(false);

        panel.add(label);
        panel.add(userName);
        panel.add(password);
        frame.setVisible(true);
        label.setIcon(image);

    }
}
