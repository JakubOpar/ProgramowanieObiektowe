import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
public class Okno extends JFrame {
    private JPanel PanelG;
    private JButton OKButton;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private final int WIDTH = 500, HEIGHT = 300;
    String passwd = "Admin";


    public static void main(String[] args) {
        Okno okno = new Okno();
        okno.setVisible(true);
    }

    public Okno()
    {
        super("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.PanelG);
        this.setSize(WIDTH,HEIGHT);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] p1 = passwordField1.getPassword();
                char[] p2 = passwordField2.getPassword();


                if(!Arrays.equals(p1, p2))
                {
                    JOptionPane.showMessageDialog(null,"Passwords do not match!");
                }

                if(Arrays.equals(p1, p2) && (!Arrays.equals(p1, passwd.toCharArray()) || !Arrays.equals(p2, passwd.toCharArray())))
                {
                    JOptionPane.showMessageDialog(null,"Incorent password!");
                }

                if(Arrays.equals(p1, p2) && Arrays.equals(p1, passwd.toCharArray()) || Arrays.equals(p2, passwd.toCharArray()))
                {
                    JOptionPane.showMessageDialog(null,"Congratulations! You entered corect password!");
                }
            }
        });
    }

}
