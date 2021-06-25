 

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ImageViewer is the main class of the image viewer application. It builds 
 * and displays the application GUI.
 * 
 * This project uses individualised evnt handlers
 * 

 */
public class MyGui3 
{
    private JFrame  myFrame = new JFrame("ImageViewer");
    // These need to be visible
    private JLabel label = new JLabel("I am a label. I can display some text.");
    private JButton buttonA = new JButton("First");
    private JButton buttonB = new JButton("Second");
    private JTextField display = new JTextField(10);
    
    public MyGui3()
    {
        makeFrame();
        makeMenuBar();
    }

    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame()
    {

        myFrame.setLayout(new FlowLayout());
        
        // add components to content  pane
        myFrame.add(label);
        myFrame.add(buttonA);
        myFrame.add(display);
        myFrame.add(buttonB);
                
        // add individualised listeners (event handlers)
        buttonA.addActionListener(new ButtonAHandler());
        buttonB.addActionListener(new ButtonBHandler());
        
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
        
        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(new OpenHandler());
        fileMenu.add(openItem);

        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(new QuitHandler());
        fileMenu.add(quitItem);
    }

    private class OpenHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
            display.setText("open file");
        }
    }

    private class QuitHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
            display.setText("exit");
 //         System.exit(0);
        }
    }
     
    private class ButtonAHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
            display.setText("first button");
        }
    }
    
    private class ButtonBHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
           display.setText("second button");
        }
    }
    
    public static void main(String[] args)
    {
        new MyGui3();
    }
}
