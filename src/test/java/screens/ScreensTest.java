/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


/**
 *
 * @author erick
 */

public class ScreensTest
{
    
    
    @Test
    public void mainScreenTest(){
        MainScreen mainScreen = new MainScreen();
        Assertions.assertEquals(480, mainScreen.getSize().getHeight());
        Assertions.assertEquals(640 , mainScreen.getSize().getWidth());
    }
    
}
