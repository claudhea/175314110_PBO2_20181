/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Frame;
import javax.swing.JFrame;
import view.FrameUtama;

/**
 *
 * @author user
 */
public class testFrame {

    public static void main(String[] args) {
        FrameUtama test = new FrameUtama();
        test.setSize(500, 400);
        test.setVisible(true);
        test.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
