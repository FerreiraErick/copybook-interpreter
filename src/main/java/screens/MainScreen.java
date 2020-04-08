/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


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
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void rightSidePane(){
        JPanel rightPane = new JPanel();
        this.add(rightPane);
        
        
    } 
    
    private void leftSidePane(){
        
    }
    
    private JButton buttonDefinitio(Integer width, Integer height, String label){
        JButton button = new JButton(label);
        button.setSize(width, height);
        
        return button;
    }

}
