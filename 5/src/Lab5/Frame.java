package Lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    JTextField jta1 = new JTextField(10);
    JButton button = new JButton("OK");
    Frame(){
        super("Картинка");
        setLayout(new FlowLayout());
        setSize(400,200);
        add(jta1);
        jta1.setFont(fnt);
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Picture(jta1.getText());
            }
        });
        setVisible(true);
    }
}
