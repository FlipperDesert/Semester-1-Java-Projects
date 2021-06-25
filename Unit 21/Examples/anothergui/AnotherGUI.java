import java.awt.*;//need to use this because of the LayoutManager
import javax.swing.*;
//Note:no event handling

public class AnotherGUI
{
    // declare & create container 
    private JFrame myFrame = new JFrame();
    private String [] items = {"Ball", "Car","Parrot","Student"};

    public AnotherGUI()  
    { 
                      
        JLabel myLabel = new JLabel("Hello");
        JButton button = new JButton("Press me!");
        JList list = new JList(items);
        //Components are added using the default LayoutManager (BorderLayout)      
        myFrame.add(button, BorderLayout.EAST);
        myFrame.add(myLabel, BorderLayout.WEST);
        myFrame.add(list, BorderLayout.SOUTH);
        
        //arrange components and make visible
        myFrame.pack();
        myFrame.setVisible(true);
    }
    
    
}


