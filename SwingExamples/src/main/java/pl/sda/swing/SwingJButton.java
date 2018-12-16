package pl.sda.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SwingJButton {
    private JPanel SwingButton;
    private JFormattedTextField formattedTextField1;
    private JButton button1;
    private JTextField textField1;
    private JLabel label;

//    public SwingJButton () {
//        button1.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                label
//
//            }
//        });
//        formattedTextField1.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyPressed(KeyEvent e) {
//                super.keyPressed(e);
//                System.out.println(e.getKeyChar());
//            }
//        });
//    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingJButton");
        GridBagLayout gridBagLayout= new GridBagLayout();
        frame.setContentPane(new SwingJButton().SwingButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);




    }
}
