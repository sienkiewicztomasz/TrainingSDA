package pl.sda.swing;

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//
//import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
//
//public class Zadanie4 {
//    private JPanel mainPanel;
//    private JLabel myLabel;
//
//    public static void main(String[] args) {
//
//        JFrame frame = new JFrame("Zadanie4");
//        Zadanie4 main = new Zadanie4();
//        frame.setContentPane(main.mainPanel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        addMenu(frame, main.myLabel);
//        frame.pack();
//        frame.setSize(500, 300);
//        frame.setBounds(300, 150, frame.getWidth(), frame.getHeight());
//        frame.setVisible(true);
//
//    }
//
//
//    private static void addMenu(final JFrame frame, final JLabel myLabel2) {
//
//        final JFileChooser fileChooser = new JFileChooser();
//
//        JMenuBar menuBar = new JMenuBar();
//
//        JMenu menu = new JMenu("File");
//
//        JMenu searchmenu = new JMenu("Search");
//
//
//        JMenuItem menuItem = new JMenuItem("Open");
//        menu.add(menuItem);
//        menuItem.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//
//                int returnVal = fileChooser.showOpenDialog(null);
//
//                if (returnVal == JFileChooser.APPROVE_OPTION) {
////                    File file = fileChooser.getSelectedFile();
////                    System.out.println(fileChooser.getName());
////                    JPanel panel = (JPanel) frame.getContentPane();
////                    Component[] components = panel.getComponents();
//
//
//                }
//            }
//
//
//        });
//        JMenuItem menuItem2 = new JMenuItem("Save");
//        menu.add(menuItem2);
//        JMenuItem menuItem3 = new JMenuItem("Exit");
//        menuItem3.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                if (JOptionPane.showConfirmDialog(frame,
//                        "Are you sure you want to close this window?", "Close Window?",
//                        JOptionPane.YES_NO_OPTION,
//                        JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
//                    System.exit(0);
//                }
//            }
//        });
//        menu.add(menuItem3);
//        JMenuItem menuItem4 = new JMenuItem("Find");
//        searchmenu.add(menuItem4);
//        menuBar.add(menu);
//        menuBar.add(searchmenu);
//        frame.setJMenuBar(menuBar);
//
//    }
//}
//
