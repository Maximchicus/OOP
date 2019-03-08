package dop6;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Win extends JFrame{
    Win(String f) {
        try {
            ImageIcon im = new ImageIcon(new URL(f));
            setSize(im.getIconWidth(), im.getIconHeight());
            JLabel jl = new JLabel(im);
            add(jl);
            setVisible(true);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Измени ввод", "Кто-то лох", JOptionPane.ERROR_MESSAGE);
        }
    }
}
