package pl.sda.swing;

import javax.swing.*;

public class SwingJButton {
    private JPanel SwingButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingJButton");
        frame.setContentPane(new SwingJButton().SwingButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
