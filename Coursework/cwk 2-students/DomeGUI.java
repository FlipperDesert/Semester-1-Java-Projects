 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 * Provide a GUI interface for the dome
 * 
 * @author A.A.Marczyk
 * @version 20/11/19
 */
public class DomeGUI 
{
    private Controller paradise = new Dome("Paradise Park");
   
    private JFrame myFrame = new JFrame("Dome GUI");
    private Container contentPane = myFrame.getContentPane();
    private JTextArea listing = new JTextArea();
    private JScrollPane scroll = new JScrollPane(listing);
    private JLabel codeLabel = new JLabel ();
    private JButton btnAll = new JButton("Show Dome");
    private JButton btnPasses = new JButton("Show Passes");
    private JButton btnFind = new JButton("Find a Pass");
    private JButton btnClear = new JButton("Clear");
    private JButton btnQuit = new JButton("Quit");
    private JPanel panelEast = new JPanel();

    
    public DomeGUI()
    {
        makeFrame();
        makeMenuBar(myFrame);
    }
    

    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame()
    {    
        contentPane.setLayout(new BorderLayout());
        //contentPane.add(listing,BorderLayout.CENTER);
        contentPane.add(scroll,BorderLayout.CENTER);
        listing.setVisible(true);
        contentPane.add(panelEast, BorderLayout.EAST);
        // set panel layout and add components
        panelEast.setLayout(new GridLayout(6,1));
        panelEast.add(btnAll);
        btnAll.addActionListener(new AllBtnHandler());
        panelEast.add(btnPasses);
        btnPasses.addActionListener(new PassesBtnHandler());
        panelEast.add(btnFind);
        btnFind.addActionListener(new FindItemHandler());
        panelEast.add(btnClear);
        btnClear.addActionListener(new ClearBtnHandler());
        panelEast.add(btnQuit);
        btnQuit.addActionListener(new QuitBtnHandler());
        btnAll.setVisible(true);
        btnPasses.setVisible(true);
        btnClear.setVisible(true);
        btnQuit.setVisible(true);
 
        // building is done - arrange the components and show
        myFrame.pack();
        myFrame.setVisible(true);
    }
    
    /**
     * Create the main frame's menu bar.
     */
    private void makeMenuBar(JFrame frame)
    {
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        // create the File menu
        JMenu menuFile = new JMenu("File");
        menubar.add(menuFile);
        
        JMenuItem itmShowAll = new JMenuItem("Show Dome");
        itmShowAll.addActionListener(new ShowAllItemHandler());
        menuFile.add(itmShowAll);

        JMenuItem itmListPasses = new JMenuItem("List all passes");
        itmListPasses.addActionListener(new ListPassesItemHandler());
        menuFile.add(itmListPasses);
        
        JMenuItem itmFind = new JMenuItem("Find a pass");
        itmFind.addActionListener(new FindItemHandler());
        menuFile.add(itmFind);
        
        JMenuItem itmMove = new JMenuItem("Move a pass");
        itmMove.addActionListener(new MoveItemHandler());
        menuFile.add(itmMove);
        
    }

    
    private class ShowAllItemHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 

            String xx = paradise.toString();
            listing.setText(xx);
            listing.setVisible(true);
        }
    }
    
    private class ListPassesItemHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
            String xx = paradise.getAllPasses();
            listing.setText(xx);
            listing.setVisible(true);
        }
    }
    
   
    private class FindItemHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        { 
            String result = "";
            String crd = JOptionPane.showInputDialog("Pass id ?: ");
            int pass = Integer.parseInt(crd);
            result = paradise.findPass(pass);
            JOptionPane.showMessageDialog(myFrame,result);    
        }
    }
    
    private class MoveItemHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String result = "";
            String crd = JOptionPane.showInputDialog("Pass id ?: ");
            int pass = Integer.parseInt(crd);
            String doorId = JOptionPane.showInputDialog("Door # ?: ");
            int door = Integer.parseInt(doorId);
            result = paradise.enterCavern(pass, door);
            JOptionPane.showMessageDialog(myFrame, result);
        }
    }
    
    private class AllBtnHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {           
            String xx = paradise.toString();
            listing.setText(xx);
            listing.setVisible(true);

        }
    }
    
    private class PassesBtnHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {           
            String xx = paradise.getAllPasses();
            listing.setText(xx);
            listing.setVisible(true);
        }
    }
    
    private class ClearBtnHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {  
            listing.setText("");
            listing.setVisible(true);
       }
    }
    
    private class QuitBtnHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {            
            listing.setVisible(false);
        }
    }
    
    public static void main(String[] args)
    {
       new DomeGUI();
    }
}
   
