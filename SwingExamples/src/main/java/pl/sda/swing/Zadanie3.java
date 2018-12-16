package pl.sda.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie3 {
    private JButton button1;
    private JPanel MainPanel;

    private int licznik = 1;
    public Zadanie3() {
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MainPanel, "Ile razy wyświetlono okno dialogowe: " + licznik);
                licznik++;
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Zadanie3");
        frame.setContentPane(new Zadanie3().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
