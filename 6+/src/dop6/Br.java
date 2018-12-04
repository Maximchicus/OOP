package dop6;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Br {
    Br(String f) {
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(f));
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Измени ввод", "Кто-то лох", JOptionPane.ERROR_MESSAGE);
            } catch (URISyntaxException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Измени ввод", "Кто-то лох", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}
