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

    public Login(){
        initialize();
    }
    private void initialize (){
        frame=new JFrame("PawnHackers Chess");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1000,600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        ImageIcon icon=new ImageIcon("1682533433732.png");
        frame.setIconImage(icon.getImage());
        panel=new JLayeredPane();
        panel.setBounds(0,0,1000,600);
        frame.add(panel);
        ImageIcon image=new ImageIcon("Rectangle 1.jpg");
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
        guest=new JButton();
        ImageIcon loginButton=new ImageIcon("Rectangle 18 (2).png");
        login.setIcon(loginButton);
        login.setBounds(500,405,105,29);
        login.setBorderPainted(false);
        ImageIcon guestButton=new ImageIcon("Rectangle 18 (3).png");
        guest.setIcon(guestButton);
        guest.setBounds(653,405,105,29);
        guest.setBorderPainted(false);

        panel.add(label);
        panel.add(userName);
        panel.add(password);
        panel.add(login);
        panel.add(guest);
        frame.setVisible(true);
        label.setIcon(image);

    }
}
