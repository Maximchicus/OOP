package dop6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {
    //private JPanel mousePanel;
    JPanel mousePanel[] = new JPanel[4];
    private JLabel statusBar;
    Frame() {
        super("Mouse");
        setLayout(new GridLayout(2, 2));
        for(int i=0; i<4; i++){
            mousePanel[i] = new JPanel();
            add(mousePanel[i]);
        }
        mousePanel[0].setBackground(Color.WHITE);
        //mousePanel[0].add(mousePanel[0], BorderLayout.CENTER);
        statusBar = new JLabel("default");
        mousePanel[0].add(statusBar, BorderLayout.SOUTH);

        HandlerClass handler = new HandlerClass();
        mousePanel[0].addMouseListener(handler);
        mousePanel[0].addMouseMotionListener(handler);
    }
    private class HandlerClass implements MouseListener, MouseMotionListener{
        public void mouseClicked(MouseEvent e) {
            statusBar.setText(String.format("Clicked at %d, %d", e.getY(), e.getY()));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            statusBar.setText("You pressed");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            statusBar.setText("You released the button");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            statusBar.setText("You entered");
            mousePanel[0].setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            statusBar.setText("You exited");
            mousePanel[0].setBackground(Color.WHITE);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            statusBar.setText("You are dragging");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            statusBar.setText("You moved the mouse");
        }
    }

}
