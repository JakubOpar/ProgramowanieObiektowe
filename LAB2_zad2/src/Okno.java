import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okno extends JFrame {

    private JPanel OknoPanel;
    private JRadioButton temperaturaRadioButton;
    private JRadioButton walutaRadioButton;
    private JRadioButton wybórRadioButton;
    private JButton uruchomAplikacjeButton;
    private JButton wyjscieButton;

    private final int WIDTH = 400, HEIGHT = 300;

    public Okno()
    {
        super("Wybór aplikacji");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH,HEIGHT);
        this.setContentPane(this.OknoPanel);

        uruchomAplikacjeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if(temperaturaRadioButton.isSelected())
                    {
                        Ramka ramka = new Ramka();
                        ramka.setVisible(true);
                        dispose();
                    }
                    if(walutaRadioButton.isSelected())
                    {
                        OknoW waluta = new OknoW();
                        waluta.setVisible(true);
                        dispose();
                    }
                    if(wybórRadioButton.isSelected())
                    {
                        Wybor wybor = new Wybor();
                        wybor.setVisible(true);
                        dispose();
                    }
            }
        });
        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login login = new Login();
                login.setVisible(true);
                dispose();
            }
        });
    }
}
