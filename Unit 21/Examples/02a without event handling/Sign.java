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

        // Add a menu bar with menus
        makeMenuBar();
    } 
    
    /**
     * Create the main frame's menu bar.
     */
    private void makeMenuBar()
    {
        JMenuBar menubar = new JMenuBar();
        myFrame.setJMenuBar(menubar);
        
        // create the File menu
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        JMenu editMenu = new JMenu("Edit");
        menubar.add(editMenu);
        JMenu helpMenu = new JMenu("Help");
        menubar.add(helpMenu);
        
        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);
        
        JMenuItem closeItem = new JMenuItem("Close");
        fileMenu.add(closeItem);
        
        JMenuItem quitItem = new JMenuItem("Quit");
        fileMenu.add(quitItem);
        
        JMenuItem copyItem = new JMenuItem("Copy");
        editMenu.add(copyItem);
        
        JMenuItem pasteItem = new JMenuItem("Paste");
        editMenu.add(pasteItem);
       
        JMenuItem deleteItem = new JMenuItem("Delete");
        editMenu.add(deleteItem);
    }
    
    public static void main(String[] args)
    {
        new Sign();
    }
}
