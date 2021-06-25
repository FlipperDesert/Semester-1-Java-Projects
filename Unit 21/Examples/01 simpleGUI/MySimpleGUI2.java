 

/**
 * A simple GUI using a Frame and two Labels
 * Showing old style code with a content pane
 * 
 * @author A.Marczyk 
 * @version 16/01/14
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MySimpleGUI2
{
    private JFrame myFrame = new JFrame();
    private JLabel myLabel = new JLabel("Hello");
    private JLabel myLabel2 = new JLabel("Goodbye");

    public MySimpleGUI2()  // constructor
    {   // declare & create container
        myFrame.setLayout(new FlowLayout());
        // JFrame has BorderLayout as default)
        
        // declare local variable contentPane
       
        //create component

        
        //add to content pane, instead of to the JFrame itself
        myFrame.add(myLabel2);
        myFrame.add(myLabel);
        
        //arrange components and make visible
        myFrame.pack();
        myFrame.setVisible(true);
     }  
     
    public static void main(String[] args)
    {
        new MySimpleGUI2();
    }
            
}
