import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Okno extends JFrame {
    private JLabel Title;
    private JTextField input;
    private JButton wyjścieButton;
    private JButton przeliczButton;
    private JPanel PanelG;
    private JLabel resulta;
    private JLabel resultb;
    private JLabel resultc;
    private final int WIDTH = 600, HEIGHT = 400;
    DecimalFormat Fm = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Okno okno = new Okno();
        okno.setVisible(true);
    }

    public Okno()
    {
        super("Przelicznik walut");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setSize(WIDTH,HEIGHT);
        this.setContentPane(this.PanelG);


        wyjścieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

            }
        });
        przeliczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String In = input.getText();
                double z = Double.parseDouble(In);
                double f = z * 0.19;
                double eu = z * 0.22;
                double d = z * 0.24;
                String Sf = String.valueOf(Fm.format(f));
                String Seu = String.valueOf(Fm.format(eu));
                String Sd = String.valueOf(Fm.format(d));
                resulta.setText(Sf);
                resultb.setText(Sd);
                resultc.setText(Seu);
            }
        });
    }
}
