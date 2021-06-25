


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ImageViewer is the main class of the image viewer application. It builds 
 * and displays the application GUI.
 * 
 * A Listener has been added to the "Open" menu item of the File menu (and not
 * to the "Quit" menu item or to the Label
 * Now, if a user selects other "Open" menu items something happens
 * 
 * This version uses "centralised" event handling. The whole class acts as the listener 
 * The "implements ActionListener" means it must have an actionPerformed() to handle events
 * In this case, only one event is noticed : selection of the "Open" menu item
 * 
 */
public class MyGui2 implements ActionListener
{
    private JFrame myFrame = new JFrame();
    JLabel label = new JLabel("I am a label. I can display some text.");
    JButton buttonA = new JButton("for show");
    JTextField display = new JTextField(10);
    
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
        myFrame.setLayout(new FlowLayout());
        
        myFrame.add(label);
        myFrame.add(buttonA);
        myFrame.add(display);
        // building is done - arrange the components and show        
        myFrame.pack();
        myFrame.setVisible(true);
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
        
        // add menu items to the File menu
        JMenuItem openItem = new JMenuItem("Open");
        fileMenu.add(openItem);
        openItem.addActionListener(this);
        
        JMenuItem quitItem = new JMenuItem("Quit");
        fileMenu.add(quitItem);
        quitItem.addActionListener(this);
    }
    
    // method required because of "implements ActionListener"
    public void actionPerformed(ActionEvent event) 
    { 
        // This will not compile as display is local to makeFrame
        // Declare the components in the same place as the JFrame
        display.setText("Item: " + event.getActionCommand());  //just displays the label on the component
    
    }

    public static void main(String[] args)
    {
        new MyGui2();
    }
}
