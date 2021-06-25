
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ImageViewer is the main class of the image viewer application. It builds 
 * and displays the application GUI.
 * 
 * This version has a number of events that need to be handled 
 * Still using "centralised" event handling
 * 
 * Components declared "outside" methods, so they can be used in other methods
 * @author Michael Kolling and David J Barnes 
 * @version 0.2
 */
public class MyGui2 implements ActionListener
{
    private JFrame myFrame;
    // these now need to be visible to all methods - hence declared and created here
    private JLabel label = new JLabel("I am a label. I can display some text.");
    private JButton buttonA = new JButton("First");
    private JButton buttonB = new JButton("Second");
    private JTextField display = new JTextField(20);
    
    /**
     * Create an ImageViewer show it on screen.
     */
    public MyGui2()
    {
        makeFrame();
        makeMenuBar();
    }

   
    // ---- swing stuff to build the frame and all its components ----
    
    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame()
    {
        myFrame = new JFrame("ImageViewer");
        
        myFrame.setLayout(new FlowLayout());
        
        myFrame.add(label);
        myFrame.add(buttonA);
        myFrame.add(display);
        myFrame.add(buttonB);

        // building is done - arrange the components and show        
        myFrame.pack();
        myFrame.setVisible(true);
        
        // add actionListeners
        buttonA.addActionListener(this); // a "listener" added for buttonA
        buttonB.addActionListener(this); // a "listener" added for buttonB
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
        
        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);
        openItem.addActionListener(this);   // a "listener" added for the "Open" menu item
        

        JMenuItem quitItem = new JMenuItem("Quit");
        fileMenu.add(quitItem);
        quitItem.addActionListener(this); // a "listener" added for the "Quit" menu item
       
    }
    
    /** This method now handles all event "centrally". It must first identify which 
     * component has been activated 
     */
    
    public void actionPerformed(ActionEvent event) 
    {        
        if (event.getSource() == buttonA) // checks whether the event has been caused by clicking buttonA
        {
           display.setText("First Button " );
        }
        else if (event.getSource() == buttonB)  // checks whether the event has been caused by clicking buttonB
        {
           display.setText("Second Button " );
        } 
        else  //No need to distinguish between "Open" and "Quit" as this only returns the menu items label
        {
           display.setText("Item: " + event.getActionCommand());
        }
        
        // What if you have more components ??
        // "if" staircases are poor design 
    }
    
    public static void main(String[] args)
    {
        new MyGui2();
    }
}
