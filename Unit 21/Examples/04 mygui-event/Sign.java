/**
 * @author A.Marczyk 
 * @version 16/01/15
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sign
{
    // declare & create container
    private JFrame myFrame = new JFrame();
    //create components
    private JLabel myLabel = new JLabel("My Flashing Sign");
    private JButton showButton = new JButton("Show");
    private JButton hideButton = new JButton("Hide");

    public Sign()  // constructor
    {   
        // set a layout manager
        myFrame.setLayout(new FlowLayout());        
    
        myFrame.add(showButton);
        myFrame.add(myLabel);
        myFrame.add(hideButton);
        //arrange components and make visible
        myFrame.pack();
        myFrame.setVisible(true);

        // add action listeners for the buttons
        showButton.addActionListener(new ShowHandler());
        hideButton.addActionListener(new HideHandler());
        
    } 
    
    
    private class ShowHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
            myLabel.setVisible(true);
        }
    }
    
    private class HideHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
            myLabel.setVisible(false);
        }
    }
    
    public static void main(String[] args)
    {
        new Sign();
    }
}
