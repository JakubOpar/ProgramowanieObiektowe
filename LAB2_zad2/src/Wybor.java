import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wybor extends JFrame {
    private JPanel wyborPanel;
    private JButton OKButton;
    private JCheckBox check1;
    private JCheckBox check2;
    private JCheckBox check3;
    private JCheckBox check4;
    private JButton wyjscieButton;

    public Wybor()
    {
        super("kursy");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(this.wyborPanel);
        this.setSize(400,200);
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float cena = 0;
                String msg = " ";
                if(check1.isSelected()){
                    cena+=3500;
                    msg+="Java #price 3500,00 PLN\n";
                }
                if(check2.isSelected()){
                    cena+=3000;
                    msg+="C# #price 3000,00 PLN\n";
                }
                if(check3.isSelected()){
                    cena+=4000;
                    msg+="C++ #price 4000,00 PLN\n";
                }
                if(check4.isSelected()){
                    cena+=5000;
                    msg+="Python #price 5000,00 PLN\n";
                }

                msg+="=================================\n";

                JOptionPane.showMessageDialog(null,msg+"Razem" + cena);

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
