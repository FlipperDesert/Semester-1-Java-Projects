
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

public class XmasFrame
{
    //create component
    private JFrame hoHoHo = new JFrame();
    private JButton xmasShow = new JButton("Show");
    private JButton xmasHide = new JButton("Hide");
    private JTextField xmasMessage = new JTextField("Happy Christmas");
    

    public XmasFrame()  // constructor
    {   // declare & create container
        hoHoHo.setLayout(new FlowLayout());
        // JFrame has BorderLayout as default)
        
        
        //add to JFrame itself - not the contentPane
        hoHoHo.add(xmasShow);
        hoHoHo.add(xmasHide);
        hoHoHo.add(xmasMessage);
        
        //arrange components and make visible
        hoHoHo.pack();
        hoHoHo.setVisible(true);
        
        xmasShow.addActionListener(new ShowButton());
        xmasHide.addActionListener(new HideButton());
        
        makeCarolsBar();
    }     
    
    private void makeCarolsBar() {
        JMenuBar carolBar = new JMenuBar();
        hoHoHo.setJMenuBar(carolBar);
        
        JMenu carols = new JMenu("Carols");
        JMenu presents = new JMenu("Presents");
        JMenu help = new JMenu("Help");
        
        carolBar.add(carols);
        carolBar.add(presents);
        carolBar.add(help);
        
        JMenuItem hark = new JMenuItem("Hark");
        JMenuItem faithful = new JMenuItem("Faithful");
        JMenuItem manger = new JMenuItem("Manger");
        JMenuItem book = new JMenuItem("Book");
        JMenuItem bottle = new JMenuItem("Bottle");
        JMenuItem game = new JMenuItem("Game");
        
        carols.add(hark);
        carols.add(faithful);
        carols.add(manger);
        presents.add(book);
        presents.add(bottle);
        presents.add(game);
        
        hark.addActionListener(new HarkHandler());
        faithful.addActionListener(new FaithfulHandler());
        manger.addActionListener(new MangerHandler());
        book.addActionListener(new BookHandler());
        bottle.addActionListener(new BottleHandler());
        game.addActionListener(new GameHandler());
        
    }
    
    private class ShowButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            xmasMessage.setText("Happy Christmas");
            xmasMessage.setVisible(true);
        }
    }
    
    private class HideButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            xmasMessage.setVisible(false);
        }
    }
    
    private class HarkHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            xmasMessage.setText("Hark the herald angels sing");
            xmasMessage.setVisible(true);
        }
    }
    
    private class FaithfulHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            xmasMessage.setText("O come, all ye faithful");
            xmasMessage.setVisible(true);
        }
    }
    
    private class MangerHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            xmasMessage.setText("Away in a manger");
            xmasMessage.setVisible(true);
        }
    }
    
    private class BookHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            xmasMessage.setText("You will receive: Space Jam: the Novelization");
            xmasMessage.setVisible(true);
        }
    }
    
    private class BottleHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            xmasMessage.setText("You will receive: A bottle of Kirkland Spring");
            xmasMessage.setVisible(true);
        }
    }
    
    private class GameHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            xmasMessage.setText("You will receive: Monsters Inc. for the PS1");
            xmasMessage.setVisible(true);
        }
    }
}


