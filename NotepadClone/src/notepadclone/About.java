package notepadclone;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class About extends JFrame implements ActionListener {

    About() {

        setBounds(400, 100, 600, 500);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/windows.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 60, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel i4 = new JLabel(i3);
        i4.setBounds(70, 40, 400, 80);
        add(i4);

        ImageIcon i5 = new ImageIcon(ClassLoader.getSystemResource("icons/notes1.png"));
        Image i6 = i5.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i7 = new ImageIcon(i6);
        JLabel i8 = new JLabel(i7);
        i8.setBounds(50, 180, 70, 70);
        add(i8);

        JLabel text = new JLabel("<html>Microsoft Windows<br> Version 22H2 <br> Microsoft Corportion. All rights reserved.<br><br> The Windows 10 Home single operating system and its user interface are <br> produced by trademark and other pending or existing intellectual property <br> rights in the Unitedd States  and other countries.</html>");
        text.setBounds(150, 100, 500, 300);
        add(text);

        JButton b = new JButton("OK");
        b.setBounds(150, 350, 120, 20);
        b.addActionListener(this);
        add(b);

//        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }
}
