package pl.sda.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld {
    private JPanel mainPanel;
    private JLabel myText;
    private JButton button1;

    public HelloWorld() {
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Kliknięto przycisk");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorldWindow");
        frame.setContentPane(new HelloWorld().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300,150,frame.getWidth(), frame.getHeight());
        frame.pack();
        frame.setVisible(true);
    }



}
