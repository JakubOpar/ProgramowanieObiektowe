import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Login extends JFrame {
    private JPanel LogPanel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;

    private final int WIDTH = 400,HEIGHT = 300;

    String login = "Jakub", password = "Admin";

    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
    }

    public Login(){
        super("Zbiór zadań");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.LogPanel);
        this.setSize(WIDTH,HEIGHT);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String logField = textField1.getText();
                char[] passwdField = passwordField1.getPassword();

                if(!logField.equals(login) || !Arrays.equals(passwdField,password.toCharArray()))
                {
                    JOptionPane.showMessageDialog(null,"Incorect login or password!");
                }
                else
                {
                    Okno okno = new Okno();
                    okno.setVisible(true);
                    dispose();
                }
            }
        });
    }
}
