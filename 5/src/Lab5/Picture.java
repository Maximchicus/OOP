package Lab5;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.*;

public class Picture extends JFrame{
    Picture(String f){
        super(f);
        //String fname = "C:\\Users\\Максим\\Documents\\Универ\\2\\ООП\\5\\src\\" + f;
        try {
            ImageIcon im = new ImageIcon(new URL(f));
            setSize(im.getIconWidth(), im.getIconHeight());
            JLabel jl = new JLabel(im);
            add(jl);
            setVisible(true);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        /*if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(f));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
        }*/
    }

}
