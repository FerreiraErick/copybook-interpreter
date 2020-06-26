/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens.mainscreen;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Point;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import screens.mainscreen.leftpane.LeftPane;
import screens.mainscreen.rightpane.RightPane;


/**
 *
 * @author erick
 */
public class MainScreen extends JFrame
{
    private static final int WIDTH = 840;
    private static final int HEIGHT = 480;
    private static final int COLUMNS = 2;
    private static final int ROWS = 0;
    
    
    public MainScreen() throws HeadlessException
    {
        this.screenStartDefinition();
    }
    
    private void screenStartDefinition(){
        this.setSize(WIDTH, HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(ROWS, COLUMNS));
        this.rightSidePane();
        this.setVisible(true);
    }
    
    private void rightSidePane(){
        RightPane rightPane = new RightPane();
        this.add(rightPane);
    } 
    
    private void leftSidePane(){
        LeftPane leftPane = new LeftPane();
        
    }
    
    private JButton buttonDefinition(Dimension dimension,Point point, String label){
        JButton button = new JButton(label);
        button.setSize(dimension);
        button.setLocation(point);
        
        return button;
    }

}
