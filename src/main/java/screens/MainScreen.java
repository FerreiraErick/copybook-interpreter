/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;


/**
 *
 * @author erick
 */
public class MainScreen extends JFrame
{
    private static final int WIDTH = 840;
    private static final int HEIGHT = 480;
    
    public MainScreen() throws HeadlessException
    {
        this.screenStartDefinition();
    }
    
    private void screenStartDefinition(){
        this.setSize(WIDTH, HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.rightSidePane();
        
        
        
        this.setVisible(true);
    }
    
    private void rightSidePane(){
        JPanel rightPane = new JPanel();
//        rightPane.setSize(200, HEIGHT);
        rightPane.setBounds(240, 840, 200, 840);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        
        rightPane.setBorder(border);
        this.add(rightPane);
        
        JButton botao1 = this.buttonDefinitio(new Dimension(50, 20), new Point( 100, 100), "Botao1");
        rightPane.add(botao1);
        
    } 
    
    private void leftSidePane(){
        
    }
    
    private JButton buttonDefinitio(Dimension dimension,Point point, String label){
        JButton button = new JButton(label);
        button.setSize(dimension);
        button.setLocation(point);
        
        return button;
    }

}
