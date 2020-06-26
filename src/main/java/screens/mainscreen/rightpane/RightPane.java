/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens.mainscreen.rightpane;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author erick
 */
public class RightPane extends JPanel{

    public RightPane() {
        this.setLayout(new FlowLayout());
        this.setBounds(240, 840, 240, 840);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        this.setBorder(border);
    }
    

}
