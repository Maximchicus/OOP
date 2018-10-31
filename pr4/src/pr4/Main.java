package pr4;

import java.lang.System;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Main extends JFrame {
    JPanel[] pnl = new JPanel[9];
    JButton ACM = new JButton("AC Milan");
    JButton RM = new JButton("Real Madrid");
    JLabel score;
    JLabel last = new JLabel("");
    int Milan, Madrid;
    JButton res = new JButton("End game");
    String fname = "C:\\Users\\Максим\\Documents\\Универ\\2\\pr4\\src\\ball.png";
    ImageIcon icon = new ImageIcon(fname);
    Main() {
        super("Match");
        setSize(400, 200);
        setLayout(new GridLayout(3,3));
        for(int i = 0 ; i < pnl.length ; i++){
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        pnl[1].setLayout(new FlowLayout());
        pnl[3].setLayout(new FlowLayout());
        pnl[4].setLayout(new FlowLayout());
        pnl[5].setLayout(new FlowLayout());
        pnl[7].setLayout(new FlowLayout());
        Milan = 0;
        Madrid = 0;
        score = new JLabel("Result: "+Milan+" X "+Madrid);
        pnl[1].add(score);
        pnl[4].add(new JLabel("Last Scorer:"));
        pnl[4].add(last);
        pnl[3].add(ACM);
        pnl[5].add(RM);
        pnl[7].add(res);
        ACM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Milan++;
                score.setText("Result: "+Milan+" X "+Madrid);
                last.setText("AC Milan");
            }
        });
        RM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Madrid++;
                score.setText("Result: "+Milan+" X "+Madrid);
                last.setText("Real Madrid");
            }
        });
        res.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String w;
                if(Milan > Madrid) w = "AC Milan";
                else if(Madrid > Milan) w = "Real Madrid";
                else w = "DRAW";
                JOptionPane.showMessageDialog(null, "WINNER: "+w, "Winner", JOptionPane.WARNING_MESSAGE, icon);
            }
        });
        setVisible(true);


    }
    public static void main(String[]args)
    {
        new Main();
    }
}
