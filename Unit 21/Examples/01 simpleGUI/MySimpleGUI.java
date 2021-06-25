 

/**
 * A simple GUI using a Frame and two Labels
 * Uses new style shortcut code
 * Adds the componentss to the JFrame instead of to the contentPane
 * 
 * @author A.Marczyk 
 * @version 16/01/14
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MySimpleGUI
{
    private JFrame hoHoHo = new JFrame();

    public MySimpleGUI()  // constructor
    {   // declare & create container
        hoHoHo.setLayout(new FlowLayout());
        // JFrame has BorderLayout as default)
        
        //create component
        JButton xmasShow = new JLabel("Show");
        JButton xmasHide = new JLabel("Hide");
        //add to JFrame itself - not the contentPane
        myFrame.add(xmasShow);
        myFrame.add(xmasShow);
        //myFrame.setSize(800,600);
        
        
        //arrange components and make visible
        myFrame.pack();
        myFrame.setVisible(true);
     }  
     
    // public static void main(String[] args)
    // {
        // new MySimpleGUI();
    // }
            
}
