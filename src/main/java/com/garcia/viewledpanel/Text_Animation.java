package com.garcia.viewledpanel;

import javax.swing.*;
import java.awt.*;

public class Text_Animation extends JPanel {


    Font fonte;
    Color corFronte, corFundo;
    String texto;
    int x = -500;
    int y = 50;
    int a = 400;
    int b = 200;

    public Text_Animation(Font fonte, Color corFronte, Color corFundo, String texto) {
        this.fonte = fonte;
        this.corFronte = corFronte;
        this.corFundo = corFundo;
        this.texto = texto;
    }

    public void paint(Graphics gp) {
        super.paint(gp);
        Graphics2D g2d = (Graphics2D) gp;
        g2d.setColor(corFronte);
        g2d.setFont(fonte);
        this.setBackground(corFundo);
        g2d.drawString(texto, x, y);
        try {
            Thread.sleep(50);
            x += 5;
            a -= 500;

            if (x > getWidth()) {

                x = -500;
            }
            if (a < 0) {

                a = 500;
            }
            repaint();

        } catch (InterruptedException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }


    }



/*    public static void main(String[] args) {


        JFrame jf = new JFrame();
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(new Text_Animation());
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }*/

}
