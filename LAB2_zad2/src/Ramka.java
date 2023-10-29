import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ramka extends JFrame {
    private JPanel JPanel;
    private JTextField Input;
    private JButton przekonwertujButton;
    private JButton wyjscieButton;
    private JLabel Result;

    private final int Width = 600, Height = 400;

    public Ramka()
    {
        super("Konwerter jednostek temperatury");
        this.setContentPane(this.JPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Width,Height);
        przekonwertujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String val = Input.getText();
                double Cel = Double.parseDouble(val);
                double Far = Cel * 2 + 32;
                String Wynik = String.valueOf(Far);
                Result.setText(Wynik);

            }
        });


        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Okno okno = new Okno();
                okno.setVisible(true);
                dispose();
            }
        });
    }
}
