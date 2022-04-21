package com.garcia.viewledpanel;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import java.util.HexFormat;

import static java.awt.Font.BOLD;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField tfTexto;

    @FXML
    private TextField tfFonte;

    @FXML
    private TextField tfCorFonte;

    @FXML
    private TextField tfCorFundo;


    @FXML
    public void aplicarButtonClicked(){
        Font fonte = new Font(tfFonte.getText(), BOLD, 60);
        int hexFonte = Integer.parseInt(tfCorFonte.getText());
        Color cf = new Color(hexFonte);
        int hexFundo = Integer.parseInt(tfCorFundo.getText());
        Color corFundo = new Color(hexFundo);
        Text_Animation ta = new Text_Animation(fonte, cf, corFundo, tfTexto.getText());
        JFrame jf = new JFrame();
        jf.setSize(1000, 300);
        ImageIcon icon = new ImageIcon("com/garcia/viewledpanel/btech.png");
        jf.setIconImage(icon.getImage());
        jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        jf.add(ta);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

}