package LoginSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Login implements ActionListener {
    private JFrame frame;
    private JLayeredPane panel;
    private JLabel label;
    private JTextField userName;
    private JPasswordField password;
    private JButton login;
    private JButton guest;
    public static int frameWidth=1012;
    public static int frameHeight=636;
    HashMap<String,String> logininfo = new HashMap<String,String>();
    private JLabel messageLabel = new JLabel();

    public Login(HashMap<String,String> loginInfoOriginal){
        logininfo = loginInfoOriginal;
        initialize();
    }
    private void initialize (){
        frame=new JFrame("PawnHackers Chess");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        frame.setSize(frameWidth,frameHeight);

        frame.setSize(frameWidth,frameHeight);

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
        panel.add(userName);
        userName.setBounds(525,265,200,30);
        userName.setBackground(new Color(251,215,138,255));
        userName.setCaretColor(new Color(39,69,129,255));

        password=new JPasswordField();
        panel.add(password);
        password.setBounds(525,327,200,30);
        password.setBackground(new Color(251,215,138,255));
        password.setCaretColor(new Color(39,69,129,255));
        password.setOpaque(true);

        panel.add(messageLabel);
        messageLabel.setBounds(525,350,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,10));

        login=new JButton();
        panel.add(login);
        guest=new JButton();
        panel.add(guest);
        ImageIcon loginButton=new ImageIcon("login button.png");
        login.setIcon(loginButton);
        login.setBounds(500,405,105,29);
        login.setBorderPainted(false);
        login.addActionListener(this);
        ImageIcon guestButton=new ImageIcon("guest button.png");
        guest.setIcon(guestButton);
        guest.setBounds(653,405,105,29);
        guest.setBorderPainted(false);
        guest.addActionListener(this);

        panel.add(label);
        frame.setVisible(true);
        label.setIcon(image);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button is Pressed");
        if(e.getSource()==login) {

            String userID = userName.getText();
            String password = String.valueOf(this.password.getPassword());

            if(logininfo.containsKey(userID)) {
                if(logininfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successful");

                    Players welcomePage = new Players();
                    frame.dispose();
                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong password");
                }

            }
            else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("username not found");
            }
        }
        else{

            Players welcomePage = new Players();
            frame.dispose();

        }

    }}
