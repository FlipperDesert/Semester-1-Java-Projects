 
/**
 * A simple GUI using a Frame and two Labels
 * 
 * @author A.Marczyk 
 * @version 16/11/16
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MySimpleGUI3
{
    private JFrame myFrame = new JFrame("xxxx");

    public MySimpleGUI3()  // constructor
    {   // declare & create container
        // assign content pane to a variable - no longer needed
        // Container contentPane = myFrame.getContentPane();
        myFrame.setLayout(new FlowLayout());
        // JFrame has BorderLayout as default)
        
        //create component
        JLabel myLabel = new JLabel("Hello");
        JLabel myLabel2 = new JLabel("Goodbye");
        //add to content pane
        myFrame.add(myLabel);
        myFrame.add(myLabel2);
        //arrange components and make visible
        myFrame.pack();
        myFrame.setVisible(true);
        
        //Add menus
        makeMenuBar();
     }   
     
    private void makeMenuBar()
    {
        JMenuBar menubar = new JMenuBar();
        myFrame.setJMenuBar(menubar);
        
        // create the File menu
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        
        // add menu items to the File menu
        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);
        
        JMenuItem quitItem = new JMenuItem("Quit");
        fileMenu.add(quitItem);
        
        JMenu editMenu = new JMenu("Edit");
        menubar.add(editMenu);
        // add menu items to the File menu
        JMenuItem replaceItem = new JMenuItem("Replace");
        editMenu.add(replaceItem);
        
        JMenuItem copyItem = new JMenuItem("Copy");
        editMenu.add(copyItem);
    }
    
    public static void main(String[] args)
    {
        new MySimpleGUI3();
    }
         
            
}
