package pl.sda.swing;

import javax.swing.*;

public class Kalkulator {


    private JPanel mainPanel;
    private JTextField textField1;
    private JButton button1;
    private JButton a1Button;
    private JButton a7Button;
    private JButton button6;
    private JButton a5Button;
    private JButton a8Button;
    private JButton button10;
    private JButton a2Button;
    private JButton button11;
    private JButton button12;
    private JButton a4Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton button14;
    private JButton a9Button;
    private JButton button16;
    private JButton a0Button;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Kalkulator");
        frame.setContentPane(new Kalkulator().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,150,0,0);
        frame.pack();
        //frame.setSize(270,300);
        frame.setResizable(true);
        frame.setVisible(true);
    }
}
