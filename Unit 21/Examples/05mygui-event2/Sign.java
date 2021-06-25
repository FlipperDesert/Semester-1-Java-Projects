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
    private JTextField myLabel2 = new JTextField("",20);
    
    private JButton showButton = new JButton("Show");
    private JButton hideButton = new JButton("Hide");

    public Sign()  // constructor
    {   
        // set a layout manager
        myFrame.setLayout(new FlowLayout());        
    
        myFrame.add(showButton);
        myFrame.add(myLabel);
        myFrame.add(hideButton);
        myFrame.add(myLabel2);
        //arrange components and make visible
        myFrame.pack();
        myFrame.setVisible(true);

        // add action listeners for the buttons
        showButton.addActionListener(new ShowHandler());
        hideButton.addActionListener(new HideHandler());
        
        // Add a menu bar with menus
        makeMenuBar();
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
        openItem.addActionListener(new OpenHandler());
        
        JMenuItem closeItem = new JMenuItem("Close");
        fileMenu.add(closeItem);
        closeItem.addActionListener(new CloseHandler());
        
        JMenuItem quitItem = new JMenuItem("Quit");
        fileMenu.add(quitItem);
        quitItem.addActionListener(new QuitHandler());
        
        // You can go on to provide handlers for these menu items
        JMenuItem copyItem = new JMenuItem("Copy");
        editMenu.add(copyItem);
        
        JMenuItem pasteItem = new JMenuItem("Paste");
        editMenu.add(pasteItem);
       
        JMenuItem deleteItem = new JMenuItem("Delete");
        editMenu.add(deleteItem);
    }
    
    private class OpenHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
            myLabel2.setText("Open file");
        }
    }

    private class CloseHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
            myLabel2.setText("Close file");
        }
    }
    
    private class QuitHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
            myLabel2.setText("Exit");
           //System.exit(0);
        }
    }
    
 // couldn'tm be bothered to do the remaining menu itesm - can you do them ?  
    
    public static void main(String[] args)
    {
        new Sign();
    }
}
