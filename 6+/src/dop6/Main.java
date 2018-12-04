package dop6;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 400);
        f.mousePanel[0].setSize(300, 300);
        f.setVisible(true);

    }
}
