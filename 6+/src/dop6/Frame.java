package dop6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {
    JPanel mousePanel[] = new JPanel[5];
    private JLabel statusBar;
    Frame() {
        super("Mouse");
        setLayout(new BorderLayout());
        for(int i=0; i<5; i++){
            mousePanel[i] = new JPanel();
        }
        add(mousePanel[0], BorderLayout.CENTER);
        add(mousePanel[1], BorderLayout.NORTH);
        add(mousePanel[2], BorderLayout.EAST);
        add(mousePanel[3], BorderLayout.SOUTH);
        add(mousePanel[4], BorderLayout.WEST);
        mousePanel[0].setBackground(Color.WHITE);
        statusBar = new JLabel("default");
        mousePanel[3].add(statusBar);
        JTextField jt1 = new JTextField(10);
        mousePanel[1].add(jt1);
        mousePanel[2].add(new JLabel("  В окне   "));
        mousePanel[4].add(new JLabel("В браузере"));

        HandlerClass handler = new HandlerClass();
        mousePanel[0].addMouseListener(handler);
        mousePanel[0].addMouseMotionListener(handler);
        mousePanel[2].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                new Win(jt1.getText());

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        mousePanel[4].addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                new Br(jt1.getText());
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
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
        public void mouseMoved(MouseEvent e) { statusBar.setText("You moved the mouse");
        }
    }

}
